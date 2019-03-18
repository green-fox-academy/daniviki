package com.greenfoxacademy.database_integration2.controller;

import com.greenfoxacademy.database_integration2.model.Todo;
import com.greenfoxacademy.database_integration2.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    private TodoService todoService;
    //TODO: remove repo
    //TODO: inject TodoService and use its methods instead of using the repo directly

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = {"/todo", "/list"}, method = RequestMethod.GET)
    public String firstPage(Model model, @RequestParam(value = "isActive", required = false) String isActive) {
        model.addAttribute("activeTodos", todoService.findActiveTodos(isActive));
        return "todo";
    }

    @GetMapping(value = "/todo/add")
    public String todoForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "todo_form";
    }

    @PostMapping(value = "/todo/add")
    public String addNewTodo(@ModelAttribute("todo") Todo todo) {
        todoService.save(todo);
        return "redirect:/todo";
    }

    @DeleteMapping(value = "/{id}/delete")
    public String deleteTodo(@ModelAttribute("todo") Todo todo, @PathVariable long id) {
        todoService.deleteTodo(id);
        return "redirect:/todo";
    }

    @GetMapping(value = "/{id}/update")
    public String updateTodo(Model model, @PathVariable long id) {
        model.addAttribute("editTodo", todoService.findById(id));
        return "update_form";
    }

    @PostMapping(value = "/{id}/update")
    public String updateTodoPost(@PathVariable long id, @ModelAttribute("editTodo") Todo editTodo) {
        Todo todo = todoService.findById(id);
        todo.setTitle(editTodo.getTitle());
        todo.setDone(editTodo.isDone());
        todo.setUrgent(editTodo.isUrgent());
        todoService.save(todo);
        return "redirect:/todo";
    }

}
