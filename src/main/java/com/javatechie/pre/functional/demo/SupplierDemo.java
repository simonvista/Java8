package com.javatechie.pre.functional.demo;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

	@Override
	public String get() {
		return "Hi JavaTechie";
	}
	public static void main(String[] args) {
		Supplier<String> supplier=new SupplierDemo();
		System.out.println(supplier.get());
	}
}
