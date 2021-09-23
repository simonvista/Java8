package com.javatechie.stream.parallel;

import java.util.List;
import java.util.stream.IntStream;

import com.javatechie.stream.map.reduce.demo.Employee;
import com.javatechie.stream.map.reduce.demo.EmployeeDatabase;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		long start=0;
		long end=0;
		start=System.currentTimeMillis();
		//single thread
		IntStream.range(1, 100).forEach(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("thread runs for "+(end-start)+"ms");
		
		//parallel stream
		start=System.currentTimeMillis();
		IntStream.range(1,100).parallel().forEach(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("threads runs for "+(end-start)+"ms");
		
		System.out.println("-----------------------------------");
		IntStream.range(1, 10).forEach(x->System.out.println("Thread name: "+Thread.currentThread().getName()+", "+x));
		IntStream.range(1, 10).parallel().forEach(x->System.out.println("Thread name: "+Thread.currentThread().getName()+", "+x));
		
		System.out.println("-----------------------------------");
		List<Employee> employees = EmployeeDatabase.getEmployees();
		//normal stream
		start=System.currentTimeMillis();
		double avgSalary = employees.stream().map(x->x.getSalary()).mapToDouble(i->i).average().getAsDouble();
		end=System.currentTimeMillis();
		System.out.println("thread runs for "+(end-start)+"ms, average salary: "+avgSalary);
		//parallel stream
		start=System.currentTimeMillis();
		avgSalary=employees.parallelStream().map(x->x.getSalary()).mapToDouble(i->i).average().getAsDouble();
		end=System.currentTimeMillis();
		System.out.println("threads run for "+(end-start)+"ms, average salary: "+avgSalary);
	}

}
