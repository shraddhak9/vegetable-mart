package com.app.service;

import java.util.List;

import com.app.entities.User;

public interface IUserService {
  
	//Register a new User 
	void addUser(User user);
	
	//Retrieve a user by emailId
	User getUserbyEmailId(String emailId);
	
	//delete a user by emailId
	void deleteUserById(long id);
	
	//get the list of Users
	List<User> getAllUsers();
	
	//update user details
	User updateUser(User user);
	
	//update user's password
	User updateUserPassword(String emailId,String newpassword);
	
	
	//verify user's password
	boolean verifyUserPassword(String emailId,String password );

	
	
	
	
}
