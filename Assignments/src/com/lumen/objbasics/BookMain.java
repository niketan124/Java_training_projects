package com.lumen.objbasics;

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book("kindness story", "karthik", 1000);
		
		book.getDetails();
		book.checkBookTYpe(1000);
		
		//second book obj
		
		Book book1 = new Book("Kruel story", "karthik", 10000);
		
		book1.getDetails();
		book1.checkBookTYpe(10000);
	}

}
