package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.model.FoxList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.applet.Main;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    private FoxList foxList;
    private Fox fox;

    public MainController(){
    }

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
        Fox newFox = foxList.getFox(name);
        if (newFox == null) {
            newFox = new Fox(name);
            foxList.addFox(newFox);
        }

        model.addAttribute("name", name);
        model.addAttribute("food", newFox.getFood() );
        model.addAttribute("drink", newFox.getDrink());
        model.addAttribute("tricks", newFox.getTricks().size());
        return "index";
    }
}
