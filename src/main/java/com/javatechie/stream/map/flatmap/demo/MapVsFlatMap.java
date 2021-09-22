package com.javatechie.stream.map.flatmap.demo;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		List<Customer> customers=EKartDataBase.getAll();
		//List<Customer> -> List<String> ->data transformation (map) | one-to-one mapping
		List<String> emails=customers.stream().map(c->c.getEmail()).collect(Collectors.toList());
		System.out.println(emails);
		System.out.println("----------------------------------------------------------------------");
		//c->c.getPhoneNumbers() -> one-to-many mapping ->flatMap->stream()
		List<List<String>> phoneNumbers=customers.stream().map(c->c.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println(phoneNumbers);
		System.out.println("---------------------------------------------------------------------");
		List<String> phoneNumbers1=customers.stream().flatMap(c->c.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(phoneNumbers1);
	}

}
