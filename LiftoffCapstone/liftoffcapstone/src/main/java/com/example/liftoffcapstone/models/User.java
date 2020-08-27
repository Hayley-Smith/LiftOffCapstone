package com.example.liftoffcapstone.models;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class User extends AbstractEntity{
    @OneToMany(mappedBy = "user")
    private List<Event> snippets =new ArrayList<Event>();

    public User() {}
}
