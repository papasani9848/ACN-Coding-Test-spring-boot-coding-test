package com.accenture.codingtest.springbootcodingtest.service;

import java.util.List;

import com.accenture.codingtest.springbootcodingtest.entity.User;

public interface UserService {
	public User createUser(User user);
	public User getUserById(Long id);
	public List<User> getAllUses();
	public void deleteUserById(Long id);
}
