package com.javatechie.java8_tutorial;

//@FunctionalInterface
interface Calculator{
	//void switchOn();
	void sum(int input);
}

public class CalculatorImpl {
	
	public static void main(String[] args) {
//		Calculator calculator=()->System.out.println("SwithOn method was called");
//		calculator.switchOn();
		Calculator calculator=input->System.out.println("sum: "+input);
		calculator.sum(2);
	}
}
