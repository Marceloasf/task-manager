package com.manager.service;

import com.manager.domain.Task;
import org.springframework.stereotype.Service;
import com.manager.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {

        this.repository = repository;
    }

    public Task save(Task newTask) {

        return this.repository.save(newTask);
    }

    public List<Task> findAll() {

        return this.repository.findAll();
    }

    public void delete(Long id) {

        this.repository.deleteById(id);
    }
}
