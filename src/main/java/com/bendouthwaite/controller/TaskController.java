package com.bendouthwaite.controller;

import com.bendouthwaite.dto.TaskDto;
import com.bendouthwaite.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @CrossOrigin
    @GetMapping(value = "/task")
    public List<TaskDto> tasks() {
        return taskService.getTaskDtos();
    }

    @PostMapping(value = "/task")
    public void saveTask(@RequestBody TaskDto taskDto) {
        taskService.saveTask(taskDto);
    }
}
