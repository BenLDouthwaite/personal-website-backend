package com.bendouthwaite.dto;

import com.bendouthwaite.model.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TaskDto {

    private Integer id;

    private String name;

    private boolean done;

    public TaskDto(Task task) {
        this(
            task.getId(),
            task.getName(),
            task.isDone()
        );
    }
}
