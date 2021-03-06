package com.javatechie.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		//filter
		List<String> list=new ArrayList<>();
		list.add("Murrit");
		list.add("John");
		list.add("Piter");
		list.add("Marek");
		list.add("Mac");
		list.stream().filter(x->x.startsWith("M")).forEach(System.out::println);
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.forEach((k,v)->System.out.println(k+", "+v));
		map.entrySet().stream().filter(x->x.getKey()%2==0).forEach(obj->System.out.println(obj));
	}

}
