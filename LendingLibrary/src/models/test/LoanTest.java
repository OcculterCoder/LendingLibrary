package models.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

import models.Book;
import models.Customer;
import models.Loan;
import utilities.GenderType;

public class LoanTest {

	@Test
	public void testDueDate() {
		Customer customer = new Customer("","","","","","",1,GenderType.MALE);
		Book book = new Book("1","","","","",1);
		
		Loan loan = new Loan(1, customer, book);
		
		GregorianCalendar gCal = new GregorianCalendar();
		gCal.add(GregorianCalendar.DAY_OF_YEAR, 14);
		Date expected = gCal.getTime();
		
		assertEquals(expected, loan.getDueDate());
		
	}

}
