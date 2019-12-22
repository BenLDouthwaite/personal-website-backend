package com.bendouthwaite.service;

import com.bendouthwaite.dto.TaskDto;
import com.bendouthwaite.model.Task;
import com.bendouthwaite.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public List<TaskDto> getTaskDtos() {
        List<Task> tasks = taskRepository.findAll();
        return tasks.stream()
                .map(task -> new TaskDto(task))
                .collect(Collectors.toList());
    }

    public void saveTask(TaskDto taskDto) {
        Task task = new Task(taskDto);
        taskRepository.save(task);
    }
}
