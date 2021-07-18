package com.taskmanager.service;

import com.taskmanager.domain.Task;
import com.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {

        this.repository = repository;
    }

    public Task save(Task newTask) {

        return this.repository.save(newTask);
    }

    public void delete(Long id) {

        this.repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<Task> findAll() {

        return this.repository.findAll();
    }

    @Transactional(readOnly = true)
    public Task findById(Long id) {

        return this.repository.findById(id).orElseThrow(RuntimeException::new);
    }
}
