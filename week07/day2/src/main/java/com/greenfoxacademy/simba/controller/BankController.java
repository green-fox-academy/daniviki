package com.greenfoxacademy.simba.controller;

import com.greenfoxacademy.simba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {

    @RequestMapping(value = "/show")
    public String showAnimal(Model model) {
        BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
        model.addAttribute("account", bankAccount);
        return "index";
    }
}
