package models;

import java.util.Date;
import java.util.GregorianCalendar;

import utilities.LoanStatus;

public class Loan {
	private int ID;
	private Customer customer;
	private Book book;
	private Date startDate;
	private Date dueDate;
	private Date returnDate;
	private LoanStatus status;
	public Loan(int iD, Customer customer, Book book) {
		ID = iD;
		this.customer = customer;
		this.book = book;
		this.startDate = new Date();
		status = LoanStatus.CURRENT;
		GregorianCalendar gCal = new GregorianCalendar();
		gCal.add(GregorianCalendar.DAY_OF_YEAR, 14);
		this.dueDate = gCal.getTime();
	}
	@Override
	public String toString() {
		return "Loan [ID=" + ID + ", customer=" + customer.getMailingName() + ", book=" + book.getTitle() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		if (ID != other.ID)
			return false;
		return true;
	}
	public Customer getCustomer() {
		return customer;
	}
	public Book getBook() {
		return book;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public LoanStatus getStatus() {
		return status;
	}
	
	public void endLoan() {
		this.returnDate = new Date();
		status = LoanStatus.HISTORIC;
	}
	
}
