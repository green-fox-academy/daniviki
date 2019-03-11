package com.greenfoxacademy.database_integration2.controller;

import com.greenfoxacademy.database_integration2.model.Todo;
import com.greenfoxacademy.database_integration2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Controller
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping(value = {"/todo", "/list"}, method = RequestMethod.GET)
    public String firstPage( Model model, @RequestParam(value = "isActive", required = false) String isDone) {
        System.out.println(isDone);
        List<Todo> activeTodos = new ArrayList<>();
        if (isDone != null && isDone.equals("true")) {
            activeTodos = todoRepository.findAll()
                    .stream()
                    .filter(t -> !t.isDone())
                    .collect(Collectors.toList());
            model.addAttribute("todos", activeTodos);
        }else{
            model.addAttribute("todos", todoRepository.findAll());
        }
        return "todo";
    }
}
