package com.javatechie.lambda.demo;

//@FunctionalInterface
interface Calculator{
	//void switchOn();
	
//	void sum(int input);
	int substract(int i1,int i2);
}

public class CalculatorImpl {
	
	public static void main(String[] args) {
//		Calculator calculator=()->System.out.println("SwithOn method was called");
//		calculator.switchOn();
		
//		Calculator calculator=input->System.out.println("sum: "+input);
//		calculator.sum(2);
		
//		Calculator calculator=(i1,i2)->i1-i2;
		Calculator calculator=(i1,i2)->{
			if(i2<i1) {
				throw new RuntimeException("i2 should not be smaller than i1");
			}
			else {
				return i2-i1;
			}
		};
		System.out.println(calculator.substract(3, 9)); 
	}
}
