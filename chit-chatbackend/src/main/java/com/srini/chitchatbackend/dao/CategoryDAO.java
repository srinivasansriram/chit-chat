package com.srini.chitchatbackend.dao;

import java.util.List;

import com.srini.chitchatbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
	
	

}
