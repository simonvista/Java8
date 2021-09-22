package com.javatechie.lambda.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	public List<Book> getBooksSortedByName(){
		List<Book> books=new BookDAO().getBooks();
		//ascending order
		//Collections.sort(books, (o1,o2)->o1.getName().compareTo(o2.getName()));
		//descending order
		Collections.sort(books, (o1,o2)->o2.getName().compareTo(o1.getName()));
		return books;
	}
	public static void main(String[] args) {
		System.out.println(new BookService().getBooksSortedByName());
	}
}
