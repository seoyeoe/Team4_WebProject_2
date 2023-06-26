package com.kosa.scheduleManagement.controller;

import com.kosa.scheduleManagement.dto.Todo;
import com.kosa.scheduleManagement.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class Controller {
    private TodoService todoService;

    @Autowired
    public void setTodoService(TodoService todoService) {
        this.todoService = todoService;
    }
    @GetMapping
    public ResponseEntity<List<Todo>> getTodoList() {
        List<Todo> todoList = todoService.getTodoList();
        return ResponseEntity.status(HttpStatus.OK).body(todoList);
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody Todo todo) {
        todoService.insertTodo(todo);
        return ResponseEntity.status(HttpStatus.CREATED).body("insert success");
    }
}
