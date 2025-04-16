package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entities.User;
import com.springboot.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public User addUserDetails(@RequestBody User user) {
		
		
		return userService.createUser(user);
	}
	@GetMapping("/user")
public List<User> getAllUserDetails() {
	return userService.getAllUser();
	
}
}
