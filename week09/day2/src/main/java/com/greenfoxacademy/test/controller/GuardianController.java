package com.greenfoxacademy.test.controller;

import com.greenfoxacademy.test.model.Groot;
import com.greenfoxacademy.test.model.Yondu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @GetMapping("/groot/{message}")
    public Object translateGroot(@PathVariable String message) {
        Groot groot = new Groot();
        groot.translateGroot(message);
        return groot;
    }

    @GetMapping("/yondu")
    public Object yondusArrow(@RequestParam double distance, @RequestParam double time) {
        Yondu yondu = new Yondu();
        yondu.calculateSpeed(distance,time);
        return yondu;
    }
}
