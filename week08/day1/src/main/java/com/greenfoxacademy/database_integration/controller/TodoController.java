package com.greenfoxacademy.database_integration.controller;

import com.greenfoxacademy.database_integration.repository.TodoReporitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    private TodoReporitory todoReporitory;

    @Autowired
    public TodoController(TodoReporitory todoReporitory) {
        this.todoReporitory = todoReporitory;
    }

    @RequestMapping({"/", "/list"})
    @ResponseBody
    public String list() {

        return "This is my first Todo";
    }

}
