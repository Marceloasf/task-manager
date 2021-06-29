package com.manager.controller;

import com.manager.domain.Task;
import com.manager.service.TaskService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("tasks")
    public List<Task> findAll() {

        Task task = new Task();
        task.setId(1L);
        task.setTitle("TEsTE");
        task.setDescription(" DESCRIPTION");
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
