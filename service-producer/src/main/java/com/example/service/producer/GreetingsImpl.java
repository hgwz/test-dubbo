package com.example.service.producer;

import com.example.service.Greetings;

/**
 * Created by yuli on 9/30/20.
 */
public class GreetingsImpl implements Greetings {
    public String say(String name) {
        return "Greetings from " + name;
    }
}
