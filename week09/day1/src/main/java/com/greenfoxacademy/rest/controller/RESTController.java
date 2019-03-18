package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.*;
import org.springframework.web.bind.annotation.*;

import java.security.PolicySpi;

@RestController
public class RESTController {

    @GetMapping("/doubling")
    public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
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
        return user;
    }

    @GetMapping("/appenda/{appendable}")
    public Object appnend(@PathVariable String appendable) {

        if (appendable == null) {
            return "404";
        }
        Append appended = new Append(appendable);
        return appended;
    }

    @PostMapping("/dountil/{action}")
    public Object doUntil(@PathVariable String action, @RequestBody DoUntil until) {

        if (action == null) {
            return new ExeptionMessage("Please provide a number!");
        }
        DoUntil doUntil = new DoUntil();
        return doUntil.doIt(action, until.getUntil());
    }
}
