package com.greenfoxacademy.database_integration;

import com.greenfoxacademy.database_integration.model.Todo;
import com.greenfoxacademy.database_integration.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseIntegrationApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    @Autowired
    public DatabaseIntegrationApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DatabaseIntegrationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("start the day"));
        todoRepository.save(new Todo("finish h2 workshop1"));
        todoRepository.save(new Todo("finish jpa workshop2"));
        todoRepository.save(new Todo("create crud priject"));
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    }
}