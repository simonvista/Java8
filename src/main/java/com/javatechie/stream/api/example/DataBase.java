package com.javatechie.stream.api.example;

import java.util.ArrayList;
import java.util.List;

//DAO layer
public class DataBase {
	public static List<Employee> getEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(176, "Roshan", "IT", 600000));
		list.add(new Employee(388, "Bikash", "Civil", 900000));
		list.add(new Employee(470, "Bimal", "Defence", 500000));
		list.add(new Employee(624, "Sourav", "Core", 400000));
		list.add(new Employee(176, "Prakash", "Social", 1200000));
		return list;
	}

}
