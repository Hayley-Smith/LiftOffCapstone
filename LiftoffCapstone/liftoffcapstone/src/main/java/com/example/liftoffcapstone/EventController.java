package com.example.liftoffcapstone;

import com.example.liftoffcapstone.models.Event;
import com.example.liftoffcapstone.models.User;
import com.example.liftoffcapstone.models.data.EventRepository;
import com.example.liftoffcapstone.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("events")
public class EventController {

    //@Autowired
    private EventRepository eventRepository;

    //@Autowired
    private UserRepository userRepository;

    private static final String userSessionKey = "user";


    @GetMapping
    public String displayAllEvents(Model model) {
        List<String> events = new ArrayList<>();
        return "events/index";
    }

    @RequestMapping("add")
    public String displayAddEventForm(Model model) {
        EventRepository events;
        model.addAttribute(new Event());


        return "add";
    }

    @PostMapping("add")
    public String processAddEventForm(@ModelAttribute @Valid Event newEvent,
                                        Errors errors, HttpServletRequest request) {

        if (errors.hasErrors()) {
            return "add";
        }
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        newEvent.setTimeStamp(currentTime);

        HttpSession session = request.getSession();
        User user = getUserFromSession(session);
        newEvent.setUser(user);
        //EventRepository.save(newEvent);

        return "redirect:";
    }

    private User getUserFromSession(HttpSession session) {
        Integer userId = (Integer) session.getAttribute(userSessionKey);
        if (userId == null) {
            return null;
        }

        Optional<User> user = userRepository.findById(userId);

        if (user.isEmpty()) {
            return null;
        }

        return user.get();
    }

    @PostMapping("")
    public String deleteEvent(@ModelAttribute @Valid Integer snippetId,
                                HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = getUserFromSession(session);
       // eventRepository.delete(newEvent);
        return "Redirect:";
    }

}
