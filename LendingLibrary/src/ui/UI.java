package ui;

import java.util.HashMap;
import java.util.TreeMap;

import models.Book;
import models.Material;

public class UI {

	public void printHeader() {
		System.out.println("BookID  Title                 Author");
		System.out.println("------  --------------------  --------------------");
	}
	
	public void finalDisplay(Book book) {
		System.out.println(setTitle(String.valueOf(book.getID()), 6) + "  " + setTitle(book.getTitle(), 20) + "  " + setTitle(book.getAuthor(), 20));
	}
	
	public String setTitle(String main, int reqLength) {
		if(main.length() > reqLength) {
			String ami = main.substring(0, reqLength);
			return ami;
		}else if(main.length() == reqLength) {
			String tumi = main.substring(0);
			return tumi;
		}else {
			int she = main.length();
			String rest = main.substring(0);
			int diff = reqLength - she;
			for(int i=1; i<=diff; i++) {
				rest = rest + " ";
			}
			return rest;
		}
	}
	
	public void printBookCatalog(HashMap<String,Book> bookCatalog) {
		for(Book nextBook : bookCatalog.values()) {
			finalDisplay(nextBook);
		}
	}
	
	public void printMaterialCatalog(TreeMap<String,Material> materialCatalog) {
		for(Material nextMaterial : materialCatalog.values()) {
			System.out.println(nextMaterial);
		}
	}
	
	
}
