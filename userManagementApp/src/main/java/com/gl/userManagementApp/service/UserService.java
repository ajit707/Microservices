package com.gl.userManagementApp.service;

import java.util.List;

import com.gl.userManagementApp.dto.User;

public interface UserService {

	List<User> getAllUsers();

	User getUSer(String id);

	void addUser(User user);

	User updateUser(User user);

	User deleteUser(String id);

}
