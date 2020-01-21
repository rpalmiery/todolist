package com.serempre.rpalmiery.todolist.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serempre.rpalmiery.todolist.rest.model.Developer;
import com.serempre.rpalmiery.todolist.rest.service.DevelopersService;

@RestController
public class DevelopersController {
	@Autowired
	DevelopersService developersService;
	
	@CrossOrigin
	@GetMapping("/Developers")
	public List<Developer> getAllDevelopers(){
		return developersService.findAll();
	}
}
