package com.greenfoxacademy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AllController {

    UtilityService utilityService;

    @Autowired
    public AllController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful")
    public String LinkToUtilities() {
        return "index";
    }

    @RequestMapping("/useful/colored")
    public String ColoredUseful(Model model, UtilityService utilityService) {
        model.addAttribute("randomColor", utilityService.randomColor().toUpperCase() );
        return "colored";
    }

    @RequestMapping("/useful/email")
    public String emailValidation(Model model, UtilityService utilityService, @RequestParam("email") String email) {
        if (!utilityService.validateEmail(email)) {
            System.out.println("No valid email.");
        }
        model.addAttribute("email", utilityService.validateEmail(email) );
        return "email";
    }


}
