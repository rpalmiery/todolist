package com.serempre.rpalmiery.todolist.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serempre.rpalmiery.todolist.rest.exceptions.ObjectNotFoundException;
import com.serempre.rpalmiery.todolist.rest.model.Task;
import com.serempre.rpalmiery.todolist.rest.repository.TaskRepository;

@Service
public class TasksService {


    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAll() {
        return (List<Task>) taskRepository.findByOrderById();
    }
	
    public Task findById(Integer id) {
    	Optional<Task> findTask = taskRepository.findById(id);
    	if (findTask.isPresent()) {
    		return findTask.get();
    	}
    	
    	throw new ObjectNotFoundException("Id: " + id);
    }
    
    public Task save(Task task) {
    	return taskRepository.save(task); 	
    }
    
}
