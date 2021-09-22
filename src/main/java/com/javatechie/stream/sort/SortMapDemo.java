package com.javatechie.stream.sort;

import java.util.*;
import java.util.Map.Entry;

import com.javatechie.stream.api.example.Employee;

public class SortMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		
		//traditional way to sort
		//sort by key in ascending
		//1. convert map to list since Collections.sort() works on list
		List<Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());
		//2.1 sort-traditional way		
//		Collections.sort(entries,new Comparator<Entry<String,Integer>>() {
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				return o1.getKey().compareTo(o2.getKey());
//			}			
//		});
		//2.2 sort-lambda expression
		Collections.sort(entries, (o1,o2)->o1.getKey().compareTo(o2.getKey()));
		
		//3. parse list
		for(Entry<String,Integer> entry:entries) {
			System.out.println(entry.getKey()+", "+entry.getValue());
		}
		System.out.println("---------------------------------------------------------");
		//use stream() to sort set
//		map.entrySet().stream().sorted((o1,o2)->o1.getKey().compareTo(o2.getKey())).forEach(x->System.out.println(x.getKey()+", "+x.getValue()));
//		System.out.println("---------------------------------------------------------");
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(x->System.out.println(x.getKey()+", "+x.getValue()));
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x->System.out.println(x.getKey()+", "+x.getValue()));
		
		//more complex map
		System.out.println("---------------------------------------------------------");
		Map<Employee,Integer> employeeMap=new TreeMap<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary()-o2.getSalary());
			}
		});
		employeeMap.put(new Employee(176,"Roshan","IT",600000), 60);
		employeeMap.put(new Employee(388, "Bikash","Civil", 900000), 90);
		employeeMap.put(new Employee(470, "Bimal","Defence",500000), 50);
		employeeMap.put(new Employee( 624, "Sourav","Core",400000), 40);
		employeeMap.put(new Employee( 176, "Prakash","Social", 1200000), 120);
		System.out.println(employeeMap);
		
	}
}
