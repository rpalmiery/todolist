package com.serempre.rpalmiery.todolist.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serempre.rpalmiery.todolist.rest.model.Developer;
import com.serempre.rpalmiery.todolist.rest.repository.DeveloperRepository;

@Service
public class DevelopersService {
	@Autowired
	DeveloperRepository developerRepository;
	
	public List<Developer> findAll() {
        return (List<Developer>) developerRepository.findAll();
    }
}
