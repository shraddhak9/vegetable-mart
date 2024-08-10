package com.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.User;
import com.app.service.IUserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private IUserService userService;

	@PostMapping("/addUser")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);

	}

	// Retrieve a user by emailId User getUserbyEmailId(String emailId);
	@GetMapping("/emailId/{emailId}")
	public User getUserbyEmailId(@PathVariable String emailId) {
		return userService.getUserbyEmailId(emailId);
	}

	// delete a user by emailId void deleteUserByEmailId(String emailId);
	@DeleteMapping("/emailId/{emailId}")
	public void deleteUserbyEmailId(@PathVariable long emailId) {
		userService.deleteUserById(emailId);
	}

	// get the list of Users List<User> getAllUsers();
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	// update user details void updateUser(User user);
	@PutMapping("/updateUser")
	public User updateUserDetails(@RequestBody User user) {
		return userService.updateUser(user);
	}

	// update user's password void updateUserPassword(String emailId,String
	// * newpassword);

	@PutMapping("/userpassword/{emailId}")
	public User updateUserPassword(@PathVariable String emailId, @RequestBody String newPassword) {
		return userService.updateUserPassword(emailId, newPassword);
	}

	@PostMapping("/verifyPassword")
	public boolean verifyPassword(@RequestBody Map<String, String> credentials) {
		String emailId = credentials.get("emailId");
		String password = credentials.get("password");

		return userService.verifyUserPassword(emailId, password);

	}

}
