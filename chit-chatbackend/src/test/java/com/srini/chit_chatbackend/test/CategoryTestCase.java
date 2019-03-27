package com.srini.chit_chatbackend.test;

	
	import static org.junit.Assert.assertEquals;

	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	import com.srini.chitchatbackend.dao.CategoryDAO;
	import com.srini.chitchatbackend.dto.Category;

	public class CategoryTestCase {
		
		private static AnnotationConfigApplicationContext context;
		
		
		private static CategoryDAO categoryDAO;
		
		private Category category;
		
		
		@BeforeClass
		public static void init()
		{
			context = new AnnotationConfigApplicationContext();
			context.scan("com.srini.chitchatbackend");
			context.refresh();
			
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");	
		}
		
		 /*@Test
		public  void testAddCategory()
		{
			category = new Category();
			category.setName("panipuri");
			category.setDescription("this is some description");
			category.setImageURL("cat_1.png");
			
			assertEquals("successfully added elements inside the table",true,categoryDAO.add(category));
		}*/
		
		
		/*@Test
		
		public void testGetCategory() 
		{
			category = categoryDAO.get(1);
			assertEquals("successfully fetched a single category element from the table","panipuri",category.getName());
			
		}*/
		
	/*@Test
		
		public void testUpdateCategory() 
		{
			category = categoryDAO.get(1);
			category.setName("bhel");
			assertEquals("successfully updated a single category element from the table",true,categoryDAO.update(category));
			
		}*/
		
	/*@Test
		
		public void testDeleteCategory() 
		{
			category = categoryDAO.get(1);
			assertEquals("successfully deleted a single category element from the table",true,categoryDAO.delete(category));
			
		}*/
		
		
	/*@Test
		
		public void testListCategory() 
		{
			
			assertEquals("successfully fetched the list of  category element from the table",1,categoryDAO.list().size());
			
		}*/
		

		
		
		@Test
		public void testCRUDCategory()
		{
			// add operation
			category = new Category();
			category.setName("panipuri");
			category.setDescription("this is some description of panipuri");
			category.setImageURL("cat_1.png");
			
			assertEquals("successfully added elements inside the table",true,categoryDAO.add(category));
			
			category = new Category();
			category.setName("bhelpuri");
			category.setDescription("this is some description of bhelpuri");
			category.setImageURL("cat_2.png");
			
			assertEquals("successfully added elements inside the table",true,categoryDAO.add(category));
			
			// updating operation
			category = categoryDAO.get(2);
			category.setName("bhel");
			assertEquals("successfully updated a single category element from the table",true,categoryDAO.update(category));
			
			
			//deleting operation
			
			
			assertEquals("successfully deleted a single category element from the table",true,categoryDAO.delete(category));
			
			
			//testing operation
			assertEquals("successfully fetched the list of  category element from the table",1,categoryDAO.list().size());
			
			
			
			
		
		
		}


}
