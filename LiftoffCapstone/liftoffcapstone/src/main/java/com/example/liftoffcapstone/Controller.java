package com.example.liftoffcapstone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/restricted")
    public String restricted(){
        return "Welcome to Equester";
    }

    @RequestMapping(value = "/user")
    public Principal user(Principal principal) {
        return principal;
    }

   /* @GetMapping("/user")
    public String user(){
        return "User Profile";
    }
*/
}
