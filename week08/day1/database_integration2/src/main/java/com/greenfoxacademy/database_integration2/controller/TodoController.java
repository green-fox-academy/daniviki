package com.greenfoxacademy.database_integration.controller;

import com.greenfoxacademy.database_integration.model.Todo;
import com.greenfoxacademy.database_integration.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping({"/", "/list"})
    public String firstPage(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todo";
    }
}
