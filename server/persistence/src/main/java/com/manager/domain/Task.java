package com.manager.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(of = "id")
public class Task {

    @Id
    private Long id;

    private String title;

    private String description;

    private LocalDateTime birthdate;
}
