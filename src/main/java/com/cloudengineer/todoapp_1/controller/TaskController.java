package com.cloudengineer.todoapp_1.controller;



import com.cloudengineer.todoapp_1.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TaskController
{
    private List<Task> tasks = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model)
    {
        model.addAttribute("tasks", tasks);
        return "index";
    }

    @PostMapping("/add")
    public String addTask(@RequestParam String taskName)
    {
        tasks.add(new Task(taskName));
        return "redirect:/";
    }
}
