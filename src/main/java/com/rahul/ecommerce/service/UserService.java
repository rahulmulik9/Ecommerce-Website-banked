package com.rahul.ecommerce.service;

import com.rahul.ecommerce.exception.UserException;
import com.rahul.ecommerce.modal.User;

import java.util.List;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
