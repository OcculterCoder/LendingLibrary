package models;

import java.util.ArrayList;

import utilities.LoanStatus;

public class LoansRegistry {
	private ArrayList<Loan> registry;
	
	public LoansRegistry() {
		registry = new ArrayList<>();
	}
	
	public void addLoan(Loan newLoan) throws LoanAlreadyExistsException {
		for(Loan loan : registry) {
			if(loan.equals(newLoan)) {
				throw new LoanAlreadyExistsException();
			}
		}
		registry.add(newLoan);
	}
	
	public Loan findLoan(String bookID) throws LoanNotFoundException{
		for(Loan loan : registry) {
			if(loan.getBook().getID().equals(bookID) && loan.getStatus() == LoanStatus.CURRENT) {
				return loan;
			}
		}
		throw new LoanNotFoundException();
	}
	
	public boolean isBookOnLoan(String bookID) {
		try {
			Loan foundLoan= findLoan(bookID);
			return true;
		}catch(LoanNotFoundException ex) {
			return false;
		}
	}
	
}
