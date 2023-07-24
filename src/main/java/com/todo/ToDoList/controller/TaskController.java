package com.todo.ToDoList.controller;

import com.todo.ToDoList.model.Task;
import com.todo.ToDoList.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * Getting all the tasks
     * @return
     */
    @GetMapping
    public List<Task> getTasks(){
        return taskService.getTasks();
    }

    /**
     * Creating a new tasks
     */
    @PostMapping
    public void addTodo(@RequestBody Task task){
        taskService.addTodo(task);
    }
}
