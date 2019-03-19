package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.*;
import org.springframework.web.bind.annotation.*;

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
        } else if (action.equalsIgnoreCase("sum")) {
            until.sum();
            return until;
        } else if (action.equalsIgnoreCase("factor")) {
            until.factor();
            return until;
        } else {
            return new ExeptionMessage("No endpoint.");
        }
    }

    @PostMapping("/arrays")
    public Object arrayHandling(@RequestBody RequestBodies requestBodies) {

        if (requestBodies.getWhat().equalsIgnoreCase("sum")) {
            ArrayHandler_int intResult = new ArrayHandler_int();
            intResult.sum(requestBodies.getNumbers());
            return intResult;

        } else if (requestBodies.getWhat().equalsIgnoreCase("multiply")) {
            ArrayHandler_int intResult = new ArrayHandler_int();
            intResult.multiply(requestBodies.getNumbers());
            return intResult;

        } else if (requestBodies.getWhat().equalsIgnoreCase("double")) {
            ArrayHandler_array arrayResult = new ArrayHandler_array();
            arrayResult.doubleElements(requestBodies.getNumbers());
            return arrayResult;
        } else {
            return new ExeptionMessage("Please provide what to do with the numbers!");
        }
    }
}
