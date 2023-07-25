// program to demonstrate on default and parameterizerd constructor

package org.tnsif.classandobject;

public class Library {
	public long noOfBooks;
	public String authorName;
	public String bookName;
	public double price;
	
	public Library() {
		System.out.println("Default constructor");
	}

	public Library(long noOfBooks, String authorName, String bookName, double price) {
		super();
		this.noOfBooks = noOfBooks;
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
		System.out.println("Parameterized Constructor");
	}
	
	public String toString() {
		return "Library [noOfbooks= "+noOfBooks+" "+"Author_Name: "+authorName+" "+"Book_Name: "+bookName+" "+"Price: "+price+"]";
	}

		
	

}
