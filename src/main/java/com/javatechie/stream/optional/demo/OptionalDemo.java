package com.javatechie.stream.optional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.javatechie.stream.map.flatmap.demo.Customer;
import com.javatechie.stream.map.flatmap.demo.EKartDataBase;

public class OptionalDemo {
	public static Customer getCustomerByEmail(String email) throws Exception {
		List<Customer> customers=EKartDataBase.getAll();
		//return customers.stream().filter(c->c.getEmail().equals(email)).findAny().get();
		//return customers.stream().filter(c->c.getEmail().equals(email)).findAny().orElse(new Customer());
		return customers.stream().filter(c->c.getEmail().equals(email)).findAny().orElseThrow(()->new Exception("email is null"));
	}
	public static void main(String[] args) throws Exception {
		//w/o stream()
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
//		if(ofNullableOptional.isPresent()) {
//			System.out.println(ofNullableOptional.get()); //abc | Optional.empty
//		}
//		else {
//			System.out.println(ofNullableOptional); //Optional[abc] | Optional.empty
//		}	
		System.out.println(ofNullableOptional.orElse("null value")); //null value
		//System.out.println(ofNullableOptional.orElseThrow(()->new IllegalArgumentException("email is null")));
		System.out.println(ofNullableOptional.map(String::toUpperCase).orElseGet(()->"email is null"));
		
		//w/ stream()
		System.out.println(getCustomerByEmail("john1@gmail.com"));
	}

}
