package com.javatechie.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> predicate=t->t%2==0;
		System.out.println(predicate.test(32));
		
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		//filter() uses Predicate as parameter
		list1.stream().filter(t->t%2==0).forEach(System.out::println);
	}
}
