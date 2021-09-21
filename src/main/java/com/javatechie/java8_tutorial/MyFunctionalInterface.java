package com.javatechie.java8_tutorial;

//FunctionalInterface, which has default and static methods, has only one abstract method
//@FunctionalInterface is optional
//@FunctionalInterface
public interface MyFunctionalInterface {
	void m1();
	default void m2() {
		System.out.println("Default method-1");
	}
	default void m3() {
		System.out.println("Default method-2");
	}
	static void m4() {
		System.out.println("Static method-1");
	}
}
