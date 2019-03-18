package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.Doubling;
import com.greenfoxacademy.rest.model.ExeptionMessage;
import com.greenfoxacademy.rest.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

    @GetMapping("/doubling")
    public Object doubling(@RequestParam(value = "input", required = false)  Integer input) {
        if (input == null) {
            return new ExeptionMessage("Please provide an input!");
        }
        Doubling doubling = new Doubling(input);
        return doubling;
    }

    @GetMapping("/greeter")
    public Object greeting(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "title", required = false) String title) {
        if (name == null && title == null) {
            return new ExeptionMessage("Please provide a name and a title!");
        } else if (name == null) {
            return new ExeptionMessage("Please provide a name!");
        } else if (title == null) {
            return new ExeptionMessage("Please provide a title!");
        }
        User user = new User(name, title);
        return user ;
    }
}
