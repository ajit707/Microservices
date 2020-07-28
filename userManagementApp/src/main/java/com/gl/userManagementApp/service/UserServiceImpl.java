package com.gl.userManagementApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.userManagementApp.dto.User;
import com.gl.userManagementApp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		return userRepository.getAllUsers();
	}

	@Override
	public User getUSer(String id) {
		return userRepository.getUSer(id);
	}

	@Override
	public void addUser(User user) {
		userRepository.addUser(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.updateUser(user);
	}

	@Override
	public User deleteUser(String id) {
		return userRepository.deleteUser(id);
	}

}
