package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("food", "pizza and lemonade" );
        model.addAttribute("tricks", 2);
        return "index";
    }

    @GetMapping("/login")
    public String getLoginForm() {
       return "login";
    }

    @PostMapping("/login")
    public String postLoginForm(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("food", "bread and water" );
        model.addAttribute("tricks", 3);
        return "index";
    }
}
