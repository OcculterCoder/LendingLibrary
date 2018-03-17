package ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import models.Book;
import models.Customer;
import models.DVD;
import models.Loan;
import models.LoanAlreadyExistsException;
import models.LoansRegistry;
import models.MaterialCatalog;
import utilities.GenderType;

public class Main {

	public static void main(String[] args) {

		Book book1 = new Book("1221", "Java Introduction", "Jarschell", "321BND", "Basabo", 326);
		Book book2 = new Book("212345", "More Java", "Schill", "RDF438", "Plauen", 241);
		Book book3 = new Book("31ASD", "Java Introduction 1", "Jars", "321BND", "Basabo", 226);
		Book book4 = new Book("KMJ432", "More Java 1", "Schi", "RDF438", "Plauen", 141);
		Book book5 = new Book("MJF34", "Java Introduction 2", "chell", "321BND", "Basabo", 126);
		Book book6 = new Book("98OU", "More Java 2", "ill", "RDF438", "Plauen", 41);
		
		DVD dvd1 = new DVD("1", "Days to remember", "Basabo", "Stepehen Spberg", "12ER4309", 120);
		DVD dvd2 = new DVD("2", "Days to remember", "Basabo", "Stepehen Spberg", "12ER4309", 120);
		//System.out.println(dvd1.getBranch());
		
		Customer customer1 = new Customer("Mr.", "Ibra", "Zin", "NC State", "012345", "ibra@zibra.com", 1, GenderType.MALE);
		
		MaterialCatalog materialCatalog = new MaterialCatalog();
		materialCatalog.addMaterial(book1);
		materialCatalog.addMaterial(book2);
		materialCatalog.addMaterial(book3);
		materialCatalog.addMaterial(book4);
		materialCatalog.addMaterial(book5);
		materialCatalog.addMaterial(book6);
		materialCatalog.addMaterial(dvd1);
		materialCatalog.addMaterial(dvd2);
		

		UI ui = new UI();
		ui.printHeader();
		ui.printMaterialCatalog(materialCatalog.getMap());

		/*try {
			Book foundBook = bookCatalog.findBook("Java Introduction");
			System.out.println("\nWe have found " + foundBook.getTitle() + " in our list");
		}catch(BookNotFoundException ex) {
			System.out.println("Sorry we have not found your desired book in our list");
		}
		
		//System.out.println(dvd1.lend(customer1));  // not licensed; will return false
		//dvd1.license();
		//System.out.println(dvd1.lend(customer1));
		//System.out.println(dvd1.lend(customer1));

		System.out.println(book1.lend(customer1));
		System.out.println(book1.lend(customer1));
		
		System.out.println(customer1);
		System.out.println(book1);
		
		//System.out.println(dvd1.equals(dvd2)); */
		
		/*Loan firstLoan = new Loan(1,customer1, book1);
		System.out.println(firstLoan.getDueDate());
		System.out.println(firstLoan);
		
		LoansRegistry registry = new LoansRegistry();
		try {
			registry.addLoan(firstLoan);
			System.out.println("Adding Loan worked");
		} catch (LoanAlreadyExistsException e) {
			System.out.println("Loan Already Exists. Adding Loan failed");
		}
		
		try {
			registry.addLoan(firstLoan);
			System.out.println("Adding Loan worked");
		} catch (LoanAlreadyExistsException e) {
			System.out.println("Loan Already Exists. Adding Loan failed");
		}
		
		System.out.println(registry.isBookOnLoan(book1.getID()));
		firstLoan.endLoan();
		System.out.println(registry.isBookOnLoan(book1.getID())); */

	}

}
