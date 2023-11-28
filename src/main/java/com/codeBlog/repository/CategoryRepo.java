package com.codeBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeBlog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

	
}
