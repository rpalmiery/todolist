package com.serempre.rpalmiery.todolist.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.serempre.rpalmiery.todolist.rest.model.Developer;
import com.serempre.rpalmiery.todolist.rest.model.Task;
import com.serempre.rpalmiery.todolist.rest.service.TasksService;

@RestController
public class TasksController {
	@Autowired
    private TasksService tasksService;
	
	@CrossOrigin
	@GetMapping("/Tasks")
	public List<Task> getAllTask(){
		//return Arrays.asList(new Task(1,"Test Task", "This is a test task", 5,3.5f, new Developer(1, "123456", "Ramiro", "Palmiery")));
		return tasksService.findAll();
	}
	
	@CrossOrigin
	@GetMapping("/Tasks/{id}")
	public Task findById(@PathVariable Integer id) {
		return tasksService.findById(id);
	}
	
	@CrossOrigin
	@PostMapping("/Tasks")
	public Task save(@RequestBody Task task) {
		if (task.getDeveloper() == null) {
			Developer developer = new Developer();
			developer.setId(1);
			task.setDeveloper(developer) ;
		}
		return tasksService.save(task);
	}
}
