package com.taskmanager.controller;

import com.taskmanager.domain.Task;
import com.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "tasks")
public class TaskResource {

    private final TaskService taskService;

    public TaskResource(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> findAll() {

        var task = new Task();
        task.setId(1L);
        task.setTitle("TESTE");
        task.setDescription("DESCRIPTION");
        task.setBirthdate(LocalDateTime.now());

        return List.of(task);
    }

    @PostMapping
    public Task save(@RequestBody Task newTask) {

        return this.taskService.save(newTask);
    }

    @DeleteMapping("/{id}")
    public void delete(@RequestParam Long id) {

        this.taskService.delete(id);
    }
}
