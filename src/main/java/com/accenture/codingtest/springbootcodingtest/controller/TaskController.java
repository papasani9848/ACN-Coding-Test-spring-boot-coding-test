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

import com.accenture.codingtest.springbootcodingtest.entity.Task;
import com.accenture.codingtest.springbootcodingtest.service.TaskService;


@RestController
public class TaskController {
	@Autowired
	private TaskService TaskService;
	
	@PostMapping("/creatTask")
	public ResponseEntity<Task> createTask( @RequestBody Task task) { 
		return ResponseEntity.ok(TaskService.createTask(task));
	}
	
	@GetMapping("/getTask/{id}")
	public ResponseEntity<Task> getTaskById(@PathVariable(value = "id") Long id) {
		return ResponseEntity.ok().body(TaskService.getTaskById(id));
	}
	
	@GetMapping("/getAllTask")
	public ResponseEntity<List<Task>> getAllTask( Long id) {
		return ResponseEntity.ok().body(TaskService.getAllTask());
	}
	
	@DeleteMapping("/deleteTaskById/{id}")
	public ResponseEntity<?>deleteTaskById(@PathVariable(value = "id") Long id) {
		TaskService.getTaskById(id);
		return ResponseEntity.ok().body("Task Deleted");
	}
	
	
	
	@PutMapping("/updateTaskById/{id}")
	public ResponseEntity<Task> updateTaskById(@PathVariable(value = "id") Long id) throws Exception {
		Task task=TaskService.getTaskById(id);
		task.setStatus("SUCCESS");
		return ResponseEntity.ok().body(TaskService.createTask(task));
	}
	
}