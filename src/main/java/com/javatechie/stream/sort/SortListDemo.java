package com.javatechie.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.javatechie.stream.api.example.DataBase;
import com.javatechie.stream.api.example.Employee;

public class SortListDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		
		//traditional way to sort a list
		Collections.sort(list); //ascending
		System.out.println(list); //[3, 4, 8, 12]
		Collections.reverse(list); //reverse order
		System.out.println(list); //[12, 8, 4, 3]
		
		//use stream to sort int list
		list.stream().sorted().forEach(System.out::println); //ascending
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //descending
		
		//use stream to sort class object by salary
		List<Employee> employees=DataBase.getEmployees();
		
		//traditional way to sort
		Collections.sort(employees, new MyComparator());		
		System.out.println(employees);		
		
	}
}
class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		//return (int) (o1.getSalary()-o2.getSalary()); //ascending
		return (int) (o2.getSalary()-o1.getSalary()); //descending
	}

	
}
