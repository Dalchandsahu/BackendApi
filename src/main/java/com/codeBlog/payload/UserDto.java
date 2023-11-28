package com.codeBlog.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;
	
	@NotNull
	@Size(min = 4, message = "User must be min of 4 characters !!")
	private String name;
	
	@Email(message = "Email Address is not valid")
	@NotNull
	private String email;
	
	@NotNull
	private String password;
	
	@NotNull
	@Size(min = 3, max = 50,  message = "Password must be mi of 3 chrs and max of 10 chars !!")
	private String about;
}
