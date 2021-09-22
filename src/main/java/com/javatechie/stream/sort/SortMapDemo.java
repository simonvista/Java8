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
		//2. sort		
		Collections.sort(entries,new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}			
		});
		//3. parse list
		for(Entry<String,Integer> entry:entries) {
			System.out.println(entry.getKey()+", "+entry.getValue());
		}
		
		
	}
}
