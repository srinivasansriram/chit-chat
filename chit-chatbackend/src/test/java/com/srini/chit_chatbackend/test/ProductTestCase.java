package com.srini.chit_chatbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srini.chitchatbackend.dao.ProductDAO;
import com.srini.chitchatbackend.dto.Product;

public class ProductTestCase {
	
private static AnnotationConfigApplicationContext context;
	
	
	private static ProductDAO productDAO;
	
	
	private Product product;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.srini.chitchatbackend");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("ProductDAO");
	}
	
	@Test
	public void testCRUDProduct() {
		
		// create operation
		product = new Product();
				
		product.setName("PANI PURI");
		product.setSpecial("NORTH");
		product.setDescription("This is some description for Panipuri!");
		product.setUnitPrice(25000);
		product.setActive(true);
		product.setCategoryID(3);
		product.setSupplierID(3);
		
		assertEquals("Something went wrong while inserting a new product!",
				true,productDAO.add(product));		
		
		
		// reading and updating the category
		product = productDAO.get(2);
		product.setName("Samsung Galaxy S7");
		assertEquals("Something went wrong while updating the existing record!",
				true,productDAO.update(product));		
				
		assertEquals("Something went wrong while deleting the existing record!",
				true,productDAO.delete(product));		
		
		// list
		assertEquals("Something went wrong while fetching the list of products!",
				6,productDAO.list().size());		
				
	}
	

}
