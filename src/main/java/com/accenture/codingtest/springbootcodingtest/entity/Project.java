package com.accenture.codingtest.springbootcodingtest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "name", unique = true, nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + "]";
	}
}
