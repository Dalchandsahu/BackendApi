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
import com.codeBlog.payload.CategoryDto;
import com.codeBlog.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	// create
	
	@PostMapping("/createCategory")
	public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto) {
		
		CategoryDto createCategory = this.categoryService.createCategory(categoryDto);		
		return new ResponseEntity<CategoryDto>(createCategory,HttpStatus.CREATED);
		
	}
	
	
	//update
	@PutMapping("/{UpdateCategoryId}")
	public ResponseEntity<CategoryDto> updateCategory(@Valid @RequestBody CategoryDto categoryDto, @PathVariable Integer UpdateCategoryId) {
		
	CategoryDto updatecCategory = this.categoryService.updatecCategory(categoryDto, UpdateCategoryId);	
	return new ResponseEntity<CategoryDto>(updatecCategory,HttpStatus.OK);
		
	}
	
	//delete
	@DeleteMapping("/{deleteId}")
	public ResponseEntity<ApiResponce> deleteCategory(@PathVariable Integer categoryId){
		this.categoryService.deleteCategory(categoryId);
		return new  ResponseEntity<ApiResponce>(new ApiResponce("category is deleted", true),HttpStatus.OK);
		
	}
	//get
	
	@GetMapping("/{categoryId}")
	public ResponseEntity<CategoryDto> getCategory(@PathVariable Integer categoryId){
		
		CategoryDto category = this.categoryService.getCategory(categoryId);
		
		return new ResponseEntity<CategoryDto>(category, HttpStatus.OK);
		
	}
	
	// getAll 
	@GetMapping("/getAllCategory")
	public ResponseEntity<List<CategoryDto>> getAllCategory(){
		List<CategoryDto> getcategorys = this.categoryService.getcategorys();
		return ResponseEntity.ok(getcategorys);
	}
	
}
















