package com.codeBlog.service;

import java.util.List;

import com.codeBlog.payload.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto user, Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAlluser();
	
	void deteUser(Integer userId);
	
	
}
