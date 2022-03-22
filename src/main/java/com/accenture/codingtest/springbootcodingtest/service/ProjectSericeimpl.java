package com.accenture.codingtest.springbootcodingtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.codingtest.springbootcodingtest.entity.Project;
import com.accenture.codingtest.springbootcodingtest.repository.ProjectRepo;

public class ProjectSericeimpl implements ProjectService {{

}

@Autowired
private ProjectRepo projectRepo;

@Override
public Project createProject(Project project) {
	return projectRepo.save(project);
}

@Override
public Project getProjectById(Long id) {
	return projectRepo.getById(id);
}

@Override
public List<Project> getAllProject() {
	return projectRepo.findAll();
}


}
