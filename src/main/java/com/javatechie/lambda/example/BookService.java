package com.javatechie.lambda.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	public List<Book> getBooksSortedByName(){
		List<Book> books=new BookDAO().getBooks();
		Collections.sort(books, new MyComparator());
		return books;
	}
	public static void main(String[] args) {
		System.out.println(new BookService().getBooksSortedByName());
	}
}

class MyComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		//ascending order
		//return o1.getName().compareTo(o2.getName());
		//ascending order
		return o2.getName().compareTo(o1.getName());
	}
	
}