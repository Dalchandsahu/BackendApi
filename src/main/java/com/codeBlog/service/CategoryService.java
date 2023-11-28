package com.codeBlog.service;

import java.util.List;

import com.codeBlog.payload.CategoryDto;

public interface CategoryService {

	// create 
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	
	CategoryDto updatecCategory(CategoryDto categoryDto, Integer categoryId);
	
	// delete
	
	void deleteCategory(Integer categoryId);
	
	// get
	
	CategoryDto getCategory(Integer categoryId);
	
	// getAll
	List<CategoryDto> getcategorys();
	
}
