package com.serempre.rpalmiery.todolist.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serempre.rpalmiery.todolist.rest.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{
	List<Task> findByOrderById();
}
