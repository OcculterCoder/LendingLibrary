package models.test;

import static org.junit.Assert.*;

import org.junit.Test;

import models.Book;
import models.Material;
import models.MaterialCatalog;
import models.MaterialNotFoundException;

public class MaterialCatalogTest {

	@Test
	public void testBookFound() {
		Book book1 = new Book("1", "Java Intro", "", "", "", 111);
		Book book2 = new Book("2", "C Intro", "", "", "", 222);
		
		MaterialCatalog materialCatalog = new MaterialCatalog();
		materialCatalog.addMaterial(book1);
		materialCatalog.addMaterial(book2);
		
		Material material;
		try {
			material = materialCatalog.findMaterial("Java Intro");
		} catch (MaterialNotFoundException e) {
			fail("Book is not found");
		}
		
	}
	
	@Test
	public void testBookNotFound() {
		Book book1 = new Book("1", "Java Intro", "", "", "", 111);
		Book book2 = new Book("2", "C Intro", "", "", "", 222);
		
		MaterialCatalog materialCatalog = new MaterialCatalog();
		materialCatalog.addMaterial(book1);
		materialCatalog.addMaterial(book2);
		
		Material material;
		try {
			material = materialCatalog.findMaterial("Python Intro");
			fail("Book is found");
		} catch (MaterialNotFoundException e) {
			
		}
		
	}

}
