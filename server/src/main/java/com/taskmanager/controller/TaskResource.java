package com.taskmanager.controller;

import com.taskmanager.domain.Task;
import com.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "tasks")
public class TaskResource {

    private final TaskService service;

    public TaskResource(TaskService taskService) {
        this.service = taskService;
    }

    @GetMapping
    public List<Task> findAll() {

        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public Task findById(@PathVariable("id") Long id) {

        return this.service.findById(id);
    }

    @PostMapping
    public Task save(@RequestBody Task newTask) {

        return this.service.save(newTask);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {

        this.service.delete(id);
    }
}
