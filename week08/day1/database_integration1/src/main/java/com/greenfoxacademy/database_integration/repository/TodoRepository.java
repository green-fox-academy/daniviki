package com.greenfoxacademy.database_integration.repository;

import com.greenfoxacademy.database_integration.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
