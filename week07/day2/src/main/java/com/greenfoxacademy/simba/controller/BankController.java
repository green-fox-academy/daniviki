package com.greenfoxacademy.simba.controller;

import com.greenfoxacademy.simba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {
    List<BankAccount> bankAccounts = new ArrayList<>();

    public BankController() {
        bankAccounts.add(new BankAccount("Simba", 2000, "Zebra" ,"lion", true, true));
        bankAccounts.add(new BankAccount("Pumbaa", 1400, "Bug", "warthog", false, true));
        bankAccounts.add(new BankAccount("Timon", 1320, "Bug", "meerkat", false, true));
        bankAccounts.add(new BankAccount("Mufasa", 1000, "Antelope", "lion", false, false));
        bankAccounts.add(new BankAccount("Rafiki", 2500, "Fruit", "mandrill", false, false));
    }

    @RequestMapping(value = "/show")
    public String showAnimal(Model model) {
        model.addAttribute("account", bankAccounts.get(0));
        return "index";
    }

    @RequestMapping(value = "/text")
    public String printOutText(Model model) {
        model.addAttribute("html", "<em>HTML</em>");
        model.addAttribute("enjoy", "<b>Enjoy yourself!</b>");
        return "text";
    }

    @RequestMapping(value = "/list")
    public String printOutAllAccounts(Model model) {
        model.addAttribute("accounts", bankAccounts);
        return "accountList";
    }
}
