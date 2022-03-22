package com.accenture.codingtest.springbootcodingtest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.codingtest.springbootcodingtest.entity.Project;
import com.accenture.codingtest.springbootcodingtest.service.ProjectService;


@RestController
public class ProjectController {
	@Autowired
	private ProjectService ProjectService;
	
	@PostMapping("/creatProject")
	public ResponseEntity<Project> createProject( @RequestBody Project project) { 
		return ResponseEntity.ok(ProjectService.createProject(project));
	}
	
	@GetMapping("/getProject/{id}")
	public ResponseEntity<Project> getProjectById(@PathVariable(value = "id") Long id) {
		return ResponseEntity.ok().body(ProjectService.getProjectById(id));
	}
	
	@GetMapping("/getAllProject")
	public ResponseEntity<List<Project>> getAllProject( Long id) {
		return ResponseEntity.ok().body(ProjectService.getAllProject());
	}
	
	@DeleteMapping("/deleteProjectById/{id}")
	public ResponseEntity<?>deleteProjectById(@PathVariable(value = "id") Long id) {
		ProjectService.getProjectById(id);
		return ResponseEntity.ok().body("Project Deleted");
	}
	
	
	
	@PutMapping("/updateProjectById/{id}")
	public ResponseEntity<Project> updateProjectById(@PathVariable(value = "id") Long id) throws Exception {
		Project project=ProjectService.getProjectById(id);
		project.setName("ashokTest");
		return ResponseEntity.ok().body(ProjectService.createProject(project));
	}
	
}

