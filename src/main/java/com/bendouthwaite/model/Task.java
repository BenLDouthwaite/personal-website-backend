package com.bendouthwaite.model;

import com.bendouthwaite.dto.TaskDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "task")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private boolean done;

    public Task(TaskDto taskDto) {
        this(
                taskDto.getId(),
                taskDto.getName(),
                taskDto.isDone()
        );
    }
}