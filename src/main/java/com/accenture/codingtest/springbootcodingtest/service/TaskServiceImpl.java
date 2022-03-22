package com.accenture.codingtest.springbootcodingtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.codingtest.springbootcodingtest.entity.Task;
import com.accenture.codingtest.springbootcodingtest.repository.TaskRepo;

@Service(value ="taskService")
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepo taskRepo;

	@Override
	public Task createTask(Task task) {
		
		return taskRepo.save(task);
	}

	@Override
	public Task getTaskById(Long id) {
	
		return taskRepo.getById(id);
	}

	@Override
	public List<Task> getAllTask() {
		
		return taskRepo.findAll();
	}

	

}
