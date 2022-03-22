package com.accenture.codingtest.springbootcodingtest.service;

import java.util.List;

import com.accenture.codingtest.springbootcodingtest.entity.Task;
import com.accenture.codingtest.springbootcodingtest.entity.User;

public interface TaskService {
	public Task createTask(Task task);
	public Task getTaskById(Long id);
	public List<Task> getAllTask();
	public static Object createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getAllUses();
	public User getUserById(Long id);

}
