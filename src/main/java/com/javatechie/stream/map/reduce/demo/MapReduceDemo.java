package com.javatechie.stream.map.reduce.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceDemo {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(3,7,8,1,5,9);
		
		//sum
		int sum=nums.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		//use reduce()
		Integer sum1=nums.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum1);
		Optional<Integer> sum2=nums.stream().reduce(Integer::sum);
		System.out.println(sum2.get());
		
		//multiplication
		Integer mult=nums.stream().reduce(1, (a,b)->a*b);
		System.out.println(mult);
		//method reference
		Integer maxVal=nums.stream().reduce(Integer::max).get();
		System.out.println(maxVal);
		maxVal=nums.stream().reduce(0,(a,b)->a>b?a:b);
		System.out.println(maxVal);
		
		List<String> strs=Arrays.asList("corejava","spring","hibernate");
		String longestStr=strs.stream().reduce((s1,s2)->s1.length()>s2.length()?s1:s2).get();
		System.out.println(longestStr);
		
		List<Employee> employees = EmployeeDatabase.getEmployees();
		//find employee whose grade is A, get salary in double
		double ave = employees.stream().filter(x->x.getGrade().equalsIgnoreCase("A")).map(x->x.getSalary()).mapToDouble(i->i).average().getAsDouble();
		System.out.println(ave);
		//find salary sum of employee whose grade is A
		double sum3 = employees.stream().filter(x->x.getGrade().equalsIgnoreCase("A")).map(x->x.getSalary()).mapToDouble(i->i).sum();
		System.out.println(sum3);
	}
}
