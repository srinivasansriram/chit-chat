package com.srini.chitchatbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.srini.chitchatbackend.dao.CategoryDAO;
import com.srini.chitchatbackend.dto.Category;

@Repository("categoryDAO")
@Transactional

public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Category> list() {


		String selectActiveCategory = "FROM Category where active = :active";
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		
		query.setParameter("active",true);
		
		return query.getResultList();

	}

	/*
	 * getting a single category
	 */
	@Override
	public Category get(int id) {
		// enhanced for loop

		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override

	public boolean add(Category category) {

		try {
			// add the category to the data table
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}
	/*
	 * updating a single category
	 */
	@Override
	public boolean update(Category category) {

		try {
			// add the category to the data table
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		
		try {
			// add the category to the data table
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
		
	}

}
