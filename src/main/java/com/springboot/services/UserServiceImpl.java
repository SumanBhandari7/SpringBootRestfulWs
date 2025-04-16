package com.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entities.User;
import com.springboot.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}
@Override
public List<User> getAllUser() {
	return userRepository.findAll();
}

}
