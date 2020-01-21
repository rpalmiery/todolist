package com.serempre.rpalmiery.todolist.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serempre.rpalmiery.todolist.rest.model.Developer;



@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Integer>{

}
