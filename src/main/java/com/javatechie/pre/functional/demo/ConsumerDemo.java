package com.javatechie.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String[] args) {
//		Consumer<Integer> consumer=t->System.out.println("print "+t);
//		consumer.accept(-1);
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		//forEach() uses Consumer as parameter
		list1.stream().forEach(t->System.out.println("print "+t));
	}
}
