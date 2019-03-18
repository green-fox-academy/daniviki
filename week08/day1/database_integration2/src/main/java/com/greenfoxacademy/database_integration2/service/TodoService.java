package com.greenfoxacademy.database_integration2.service;

import com.greenfoxacademy.database_integration2.model.Todo;
import com.greenfoxacademy.database_integration2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findActiveTodos(String isActive) {
        List<Todo> activeTodos;
        if ( isActive != null && isActive.equals("true")) {
            activeTodos = todoRepository.findAll()
                    .stream()
                    .filter(s -> !s.isDone())
                    .collect(Collectors.toList());
        }else {
            activeTodos = todoRepository.findAll();
        }

        return activeTodos;
    }

    public void save(Todo todo) {
        todoRepository.save(todo);
    }

    public void deleteTodo(long id) {
        todoRepository.deleteById(id);
    }

    public Todo findById(long id) {
        return todoRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    public Todo getTodo(long id) {
        return todoRepository.getOne(id);
    }
}

