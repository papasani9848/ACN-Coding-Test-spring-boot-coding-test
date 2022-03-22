package com.accenture.codingtest.springbootcodingtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.codingtest.springbootcodingtest.entity.User;
import com.accenture.codingtest.springbootcodingtest.repository.UserRepo;

@Service(value ="userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public User createUser(User user) {		
		return userRepo.save(user);
	}

	@Override
	public User getUserById(Long id) {
		return userRepo.getById(id);
	}

	@Override
	public List<User> getAllUses() {
		return userRepo.findAll();
	}

	@Override
	public void deleteUserById(Long id) {
		
		  userRepo.deleteById(id);
	}

}
