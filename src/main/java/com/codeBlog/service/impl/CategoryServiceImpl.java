package com.codeBlog.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeBlog.entities.Category;
import com.codeBlog.exception.ResourceNotFoundException;
import com.codeBlog.payload.CategoryDto;
import com.codeBlog.repository.CategoryRepo;  
import com.codeBlog.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category category = this.modelMapper.map(categoryDto, Category.class);
		Category addcat = this.categoryRepo.save(category);
		
		return this.modelMapper.map(addcat, CategoryDto.class);
	}
	
	@Override
	public CategoryDto updatecCategory(CategoryDto categoryDto, Integer categoryId) {

        Category category = this.categoryRepo.findById(categoryId)
        		.orElseThrow(()-> new ResourceNotFoundException("Category", "CategoryId", categoryId));
        category.setCategoryTitel(categoryDto.getCategoryTitel());
        categoryDto.setCategoryDescription(categoryDto.getCategoryDescription());
        Category Updatecate = this.categoryRepo.save(category);
        
        return this.modelMapper.map(Updatecate, CategoryDto.class);
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		Category category = this.categoryRepo.findById(categoryId)
				.orElseThrow(()-> new ResourceNotFoundException("Categotry", "CategoryId", categoryId));
		this.categoryRepo.delete(category);
		
	}

	@Override
	public CategoryDto getCategory(Integer categoryId) {
		
		Category category = this.categoryRepo.findById(categoryId)
				.orElseThrow(()-> new ResourceNotFoundException("Category", "CategoryId", categoryId));
		
		return this.modelMapper.map(category, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getcategorys() {
		List<Category> findAll = this.categoryRepo.findAll();
		
		List<CategoryDto> catDtos = findAll.stream().map((cat)->this.modelMapper.map(cat, CategoryDto.class)).collect(Collectors.toList());
		return catDtos;
	}

}
