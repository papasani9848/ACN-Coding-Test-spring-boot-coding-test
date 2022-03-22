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

import com.accenture.codingtest.springbootcodingtest.entity.User;
import com.accenture.codingtest.springbootcodingtest.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService UserService;
	
	@PostMapping("/creatUser")
	public ResponseEntity<User> createUser( @RequestBody User user) { 
		return ResponseEntity.ok(UserService.createUser(user));
	}
	
	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long id) {
		return ResponseEntity.ok().body(UserService.getUserById(id));
	}
	
	@GetMapping("/getAllUser")
	public ResponseEntity<List<User>> getAllUsers( Long id) {
		return ResponseEntity.ok().body(UserService.getAllUses());
	}
	
	@DeleteMapping("/deleteUserById/{id}")
	public ResponseEntity<?>deleteUserById(@PathVariable(value = "id") Long id) {
		UserService.deleteUserById(id);
		return ResponseEntity.ok().body("User Deleted");
	}
	
	
	
	@PutMapping("/updateUserById/{id}")
	public ResponseEntity<User> updateUserById(@PathVariable(value = "id") Long id) throws Exception {
		User user=UserService.getUserById(id);
		user.setPassword("TEST");
		return ResponseEntity.ok().body(UserService.createUser(user));
	}
	
	
}
