package com.lumen.objbasics;

public class Book {
	String title;
	String author;
	int price;
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void getDetails() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("price: "+price);
	}
	
	void checkBookTYpe(int price) {
		System.out.println("ur book ur genere");
		if(price > 500) {
			System.out.println("It's a premium book");
		} else {
			System.out.println("It's a standard book");
		}
	}
	

}
