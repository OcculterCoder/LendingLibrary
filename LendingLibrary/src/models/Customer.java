package models;

import java.util.Date;
import java.util.GregorianCalendar;

import utilities.GenderType;

public class Customer {
	
	private String title;
	private String firstName;
	private String surName;
	private String address;
	private String phoneNumber;
	private String email;
	private int customerNumber;
	private boolean isValid;
	private GenderType gender;
	private Date expiryDate;
	
	public Customer(String title, String firstName, String surName, String address, String phoneNumber, String email,
			int customerNumber, GenderType gender) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.surName = surName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.customerNumber = customerNumber;
		this.gender = gender;
		isValid = true;
		GregorianCalendar gCal = new GregorianCalendar();
		gCal.add(GregorianCalendar.DAY_OF_YEAR, 365);
		this.expiryDate = gCal.getTime();
	}

	public String getFirstName(){
		return firstName;
	}
	
	public String getSurName(){
		return surName;
	}

	public String getTitle() {
		return title;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}
	
	public GenderType getGender() {
		return gender;
	}

	public String getMailingName() {
		String mailingName;
		mailingName = title + " " + firstName.substring(0, 1) + " " + surName;
		return mailingName;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	@Override
	public String toString() {
		return getMailingName();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerNumber != other.customerNumber)
			return false;
		return true;
	}
	
	
	
	
}
