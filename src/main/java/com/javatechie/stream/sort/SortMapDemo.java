package com.javatechie.stream.sort;

import java.util.*;
import java.util.Map.Entry;

public class SortMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		
		//traditional way to sort
		//sort by key in ascending
		//1. convert map to list since Collections.sort() works on list
		List<Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());
		//2.1 sort-traditional way		
//		Collections.sort(entries,new Comparator<Entry<String,Integer>>() {
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				return o1.getKey().compareTo(o2.getKey());
//			}			
//		});
		//2.2 sort-lambda expression
		Collections.sort(entries, (o1,o2)->o1.getKey().compareTo(o2.getKey()));
		
		//3. parse list
		for(Entry<String,Integer> entry:entries) {
			System.out.println(entry.getKey()+", "+entry.getValue());
		}
		System.out.println("---------------------------------------------------------");
		//use stream() to sort set
//		map.entrySet().stream().sorted((o1,o2)->o1.getKey().compareTo(o2.getKey())).forEach(x->System.out.println(x.getKey()+", "+x.getValue()));
//		System.out.println("---------------------------------------------------------");
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(x->System.out.println(x.getKey()+", "+x.getValue()));
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x->System.out.println(x.getKey()+", "+x.getValue()));
		
		
	}
}
