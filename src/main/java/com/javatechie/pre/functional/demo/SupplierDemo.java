package com.javatechie.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> supplier=()->"Hi JavaTechie";
		System.out.println(supplier.get());
		
		//List<String> list1=Arrays.asList("a","b","c","d");	//a
		List<String> list1=Arrays.asList();						//Hi JavaTechie
		//orElseGet() uses Supplier as parameter
		System.out.println(list1.stream().findAny().orElseGet(supplier));
	}
}
