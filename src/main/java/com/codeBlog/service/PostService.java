package com.codeBlog.service;

import java.util.List;

import com.codeBlog.entities.Post;
import com.codeBlog.payload.PostDto;

public interface PostService {

	//create
	PostDto createPost(PostDto postDto , Integer userId, Integer categoryId);
	
	//Update
	Post updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//GetAll Post
	List<Post> getAllPost();

	//get single Post
	Post getPostById(Integer postId);
	
	// Get All Category
	List<Post> getPostbyCategory(Integer categoryId);
	
	//Get Post By Id
	List<Post> getPostByUser(Integer userid);
	
	
	

}
