package com.javatechie.stream.map.flatmap.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EKartDataBase {
	public static List<Customer> getAll(){
		return Stream.of(
			new Customer(101,"john","john@gmail.com",Arrays.asList("397937955","21654725")),
			new Customer(101,"smith","smith@gmail.com",Arrays.asList("89563865","2487238947")),
			new Customer(101,"peter","peter@gmail.com",Arrays.asList("38946328654","3286487236")),
			new Customer(101,"kely","kely@gmail.com",Arrays.asList("38924682934","736568338"))
		).collect(Collectors.toList());
	}
}
