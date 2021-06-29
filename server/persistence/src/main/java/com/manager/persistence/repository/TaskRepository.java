package com.manager.persistence.repository;

import com.manager.persistence.domain.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, Long> {

}
