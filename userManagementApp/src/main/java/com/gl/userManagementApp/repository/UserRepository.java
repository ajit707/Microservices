package com.gl.userManagementApp.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.gl.userManagementApp.dto.User;

@Repository
public class UserRepository {

	List<User> userList = new ArrayList<User>();

	public List<User> getAllUsers() {
		return userList;
	}

	public User getUSer(String id) {
		Optional<User> findFirst = userList.stream().filter(u -> u.getId().equals(id)).findFirst();
		if (findFirst.isPresent()) {
			return findFirst.get();
		} else {

			return new User();
		}
	}

	public void addUser(User user) {
		userList.add(user);
	}

	public User updateUser(User user) {

		for (User u : userList) {
			if (u.getId().equals(user.getId())) {
				u.setName(user.getName());
				u.setAddress(user.getAddress());
				return u;
			}
		}
		return new User();
	}

	public User deleteUser(String id) {

		Optional<User> findFirst = userList.stream().filter(u -> u.getId().equals(id)).findFirst();
		if (findFirst.isPresent()) {
			User user = findFirst.get();
			userList.remove(user);
			return user;
		} else {
			return new User();
		}

	}

}
