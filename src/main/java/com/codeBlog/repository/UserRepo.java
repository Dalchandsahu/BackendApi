package com.codeBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeBlog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
