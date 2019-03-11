package com.greenfoxacademy.database_integration2;

import com.greenfoxacademy.database_integration2.model.Todo;
import com.greenfoxacademy.database_integration2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseIntegration2Application implements CommandLineRunner {

    private TodoRepository todoRepository;

    @Autowired
    public DatabaseIntegration2Application(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DatabaseIntegration2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
