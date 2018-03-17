package models;

import java.util.HashSet;

public class CustomerRecords {

	private HashSet<Customer> records;
	
	public CustomerRecords() {
		this.records = new HashSet<Customer>();
	}
	
	public void addCustomer(Customer customer) {
		records.add(customer);
	}
	
	public Customer findByName(String name) throws CustomerNotFoundException {
		for(Customer customer : records) {
			if(customer.getMailingName().equals(name)) {
				return customer;
			}
		}
		throw new CustomerNotFoundException();
	}
	
	public int getNumberOfCustomer() {
		return records.size();
	}
	
}
