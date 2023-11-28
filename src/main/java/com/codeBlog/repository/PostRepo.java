package com.codeBlog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeBlog.entities.Category;
import com.codeBlog.entities.Post;
import com.codeBlog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);
	List<Post> findByCagegory(Category category);
	
}
