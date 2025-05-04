package com.sultanmansoor40.todolistproject.controllers;

import com.sultanmansoor40.todolistproject.entities.Todo;
import com.sultanmansoor40.todolistproject.entities.TodoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/todos")
public class TodoController {
    private final TodoRepository todoRepository;
    public TodoController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @PostMapping
    public Todo newTodo(@RequestBody Todo todo){
        return  this.todoRepository.save(todo);
    }
}
