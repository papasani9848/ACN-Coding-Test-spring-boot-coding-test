package com.accenture.codingtest.springbootcodingtest.service;

import java.util.List;

import com.accenture.codingtest.springbootcodingtest.entity.Project;
import com.accenture.codingtest.springbootcodingtest.entity.Task;

public interface ProjectService {
	public Project createProject(Project project);
	public Project getProjectById(Long id);
	public List<Project> getAllProject();
}
