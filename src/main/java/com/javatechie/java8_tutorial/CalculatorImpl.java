package com.javatechie.java8_tutorial;

interface Calculator{
	void switchOn();
}

public class CalculatorImpl {
	
	public static void main(String[] args) {
		Calculator calculator=()->System.out.println("SwithOn method was called");
		calculator.switchOn();
	}
}
