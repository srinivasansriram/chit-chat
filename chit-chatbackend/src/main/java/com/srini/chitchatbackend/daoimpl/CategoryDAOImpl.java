package com.srini.chitchatbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.srini.chitchatbackend.dao.CategoryDAO;
import com.srini.chitchatbackend.dto.Category;

@Repository("categoryDAO")

public class CategoryDAOImpl implements CategoryDAO {
	
	
	private static List<Category> categories = new ArrayList<>();
	
	
	static 
	{
		Category category = new Category();
		
		category.setId(1);
		category.setName("Pani puri");
		category.setDescription("this is some description for panipuri");
		category.setImageURL("CAT_1.png");
		
		
		categories.add(category);
		
		//second category
		category = new Category();	
		category.setId(2);
		category.setName("Bhel puri");
		category.setDescription("this is some description for bhelpuri");
		category.setImageURL("CAT_2.png");
				
		categories.add(category);
		category = new Category();
		category.setId(3);
		category.setName("sev puri");
		category.setDescription("this is some description for sevpuri");
		category.setImageURL("CAT_3.png");
		
		
		categories.add(category);
		
		
		
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	
	}

	@Override
	public Category get(int id) {
		// enhanced for loop
		for(Category category : categories)
		{
			if(category.getId() == id) 
				return category;
		}
		return null;
	}

}
