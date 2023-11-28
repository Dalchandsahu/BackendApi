package com.codeBlog.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeBlog.payload.ApiResponce;
import com.codeBlog.payload.UserDto;
import com.codeBlog.service.UserService;

@RestController
@RequestMapping("/api/users")
public class Usercontroller {

	@Autowired
	private UserService userService;
	
	// Post - create user
	@PostMapping("/getUser")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto){
		
		UserDto createUserDto = this.userService.createUser(userDto);
		
		return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
		
	}
	
	// Put -Update User
	
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateuser(@Valid @RequestBody UserDto userDto, @PathVariable("userId") Integer userId){
		UserDto updateUser = this.userService.updateUser(userDto, userId);
		return ResponseEntity.ok(updateUser);
		
	}
	
	// Delete - delete users
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<?> deleteUser( @PathVariable("userId") Integer userId){
		this.userService.deteUser(userId);
		return new ResponseEntity<ApiResponce>(new ApiResponce("User deleted Successfully", true), HttpStatus.OK);
	}
	
	//Get - user get
	@GetMapping("/{AllUser}")
	public ResponseEntity<List<UserDto>> getAllUser()
	{
		return ResponseEntity.ok(this.userService.getAlluser());
		
	}
	
	// Get - get user by Id
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getsingUser(@PathVariable Integer userId)
	{
		return ResponseEntity.ok(this.userService.getUserById(userId));
		
	}
	
	 
	
}














