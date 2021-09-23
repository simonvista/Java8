package com.javatechie.stream.optional.demo;

import java.util.Arrays;
import java.util.Optional;

import com.javatechie.stream.map.flatmap.demo.Customer;

public class OptionalDemo {

	public static void main(String[] args) {
		//Customer customer=new Customer(101,"john","abc",Arrays.asList("397937955","21654725"));
		Customer customer=new Customer(101,"john",null,Arrays.asList("397937955","21654725"));
		//3 ways to create Optional obj: empty() | of() if obj is not null | ofNullable() if obj is what ever value
		//Optional.empty()
		Optional<Object> emptyOptional=Optional.empty();
		System.out.println(emptyOptional);
		//Optional.of(null)
		//Optional<String> ofOptional=Optional.of(customer.getEmail());
		//System.out.println(ofOptional); //throw exception
		//Nullable(null)
		Optional<String> ofNullableOptional=Optional.ofNullable(customer.getEmail());
		System.out.println(ofNullableOptional); //throw exception
	}

}
