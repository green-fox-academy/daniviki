package com.greenfox.error.model.controller;

import com.greenfox.error.model.service.UserService;
import com.greenfox.error.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
@RequestMapping("/app")
public class AppController {

    UserService service;

    @Autowired
    public AppController(UserService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("new_user", new User());
        return "main";
    }

    @PostMapping("/app")
    public String create(@ModelAttribute("user") User user) {
        service.save(user);
        return "redirect:/";
    }
}