package models.test;

import static org.junit.Assert.*;

import org.junit.Test;

import models.Customer;
import models.CustomerNotFoundException;
import models.CustomerRecords;
import utilities.GenderType;

public class CustomerRecordsTest {
	
	CustomerRecords records;
	
	public CustomerRecordsTest() {
		records = new CustomerRecords();
		Customer customer2 = new Customer("Mrs.", "Sandra", "Hatheway", "LA", "3215", "sandra@hatheway.com", 2, GenderType.FEMALE);
		records.addCustomer(customer2);
	}

	@Test
	public void testAddCustomer() {
		Customer customer1 = new Customer("Mr.", "Ibra", "Zin", "NC State", "012345", "ibra@zibra.com", 1, GenderType.MALE);
		int before = records.getNumberOfCustomer();
		records.addCustomer(customer1);
		int after = records.getNumberOfCustomer();
		assertTrue((before+1) == after);
	}
	
	@Test
	public void testFindCustomer() {
		try {
			Customer customer = records.findByName("Mrs. S Hatheway");
		}catch(CustomerNotFoundException ex) {
			fail("Sorry No customer with that name");
		}
	}

}
