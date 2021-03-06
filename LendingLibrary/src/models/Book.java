package models;

public class Book extends Material{
	private String author;
	private String isbn;
	private int noOfPages;
	
	public Book(String id, String title, String author, String isbn, String branch, int noOfPages) {
		super(id, title, branch);
		this.author = author;
		this.isbn = isbn;
		this.noOfPages = noOfPages;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public void sendForRepair() {
		System.out.println("The book has been sent for repair");
	}

	@Override
	public int getLoanPeriod() {
		return 21;
	}
	
	@Override
	public String toString() {
		return "BOOK: " + getID() + " " + getTitle() + " / " + getAuthor();
	}
	
}
