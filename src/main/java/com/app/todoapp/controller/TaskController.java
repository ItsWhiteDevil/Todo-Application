package com.app.todoapp.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.todoapp.models.Task;
import com.app.todoapp.services.TaskService;

@Controller
public class TaskController {

    private final TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping("/")
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks); // Add tasks to the model
        return "tasks"; // Return the name of the view to render
    }

    @PostMapping
    public String createTask(@RequestParam String title) {
        taskService.createTask(title);
        return "redirect:/"; // Redirect to the tasks view after creating a new task
    }
    @GetMapping("/{id}/update") // Changed from @PostMapping to @GetMapping to match the <a> link style
    public String updateTask(@PathVariable Long id, @RequestParam String title) {
        taskService.updateTask(id, title);
        return "redirect:/";
    }
    @GetMapping("/{id}/delete") 
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/"; // Redirect to the tasks view after deleting a task
    }

    @GetMapping("/{id}/done")
    public String donetask(@PathVariable Long id){
        taskService.donetask(id);
        return "redirect:/";
    }
}
