package com.codeBlog.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer PostId;
	
	private String title;
	
	private  String imageName;
	
	private Date addeDate;
	
	@ManyToOne
	private Category category;
	
	@ManyToOne 
	private User user;
	

	
}
