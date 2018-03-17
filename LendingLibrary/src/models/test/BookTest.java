package models.test;

import static org.junit.Assert.*;

import org.junit.Test;

import models.Book;

public class BookTest {

	@Test
	public void testBookEqualsMethod() {
		Book book1 = new Book("1", "", "", "", "", 11);
		Book book2 = new Book("2", "", "", "", "", 11);
		
		assertFalse(book1.equals(book2));
		
	}

}
