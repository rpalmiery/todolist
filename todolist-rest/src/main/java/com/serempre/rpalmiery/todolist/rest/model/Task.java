package com.serempre.rpalmiery.todolist.rest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "tasks")
@JsonSerialize
public class Task implements Serializable{
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    @Column(name = "estimated_time")
    private Integer estimateTime;
    @Column(name = "worked_time")
    private Float workedTime;
    @ManyToOne
    @JoinColumn(name = "developer_id_fk", referencedColumnName = "id")
    private Developer developer;
    
    public Task() {
    	super();
    }
    
    public Task(Integer id, String title, String description, Integer estimateTime, Float workedTime,
			Developer developer) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.estimateTime = estimateTime;
		this.workedTime = workedTime;
		this.developer = developer;
	}

    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getEstimateTime() {
		return estimateTime;
	}
	public void setEstimateTime(Integer estimateTime) {
		this.estimateTime = estimateTime;
	}
	public Float getWorkedTime() {
		return workedTime;
	}
	public void setWorkedTime(Float workedTime) {
		this.workedTime = workedTime;
	}
	public Developer getDeveloper() {
		return developer;
	}
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	    
}
