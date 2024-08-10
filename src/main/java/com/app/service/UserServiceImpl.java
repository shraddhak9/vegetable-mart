package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.User;
import com.app.repository.UserRepository;

@Transactional
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void addUser(User user) {
		userRepository.save(user);

	}

	@Override
	public User getUserbyEmailId(String emailId) {
		return userRepository.findById(emailId).orElseThrow();

	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();

	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);

	}

	@Override
	public User updateUserPassword(String emailId, String newpassword) {
		User user = getUserbyEmailId(emailId);
		if (user != null) {
			user.setPassword(newpassword);
			userRepository.save(user);
		}
		return user;
	}

	@Override
	public boolean verifyUserPassword(String emailId, String password) {
		User user = getUserbyEmailId(emailId);
		return user != null && user.getPassword().equals(password);

	}

	@Override
	public void deleteUserById(long id) {
		userRepository.deleteById(null);
		
		
	}

}
