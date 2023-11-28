package com.codeBlog.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class CategoryDto {

	private Integer CategoryId;
	private String categoryTitel;
	private String categoryDescription;
	
}
