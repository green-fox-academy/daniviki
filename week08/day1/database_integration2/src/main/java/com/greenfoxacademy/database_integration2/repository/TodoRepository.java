package com.greenfoxacademy.database_integration2.repository;

import com.greenfoxacademy.database_integration2.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
