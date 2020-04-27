package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AllMaps {
	public static void main (String[]args) {
		
		//lets create a grocery map item without caring an order
		
		Map<String,Integer> grocery=new HashMap<>();
		grocery.put("milk", 2);
		grocery.put("cucumber", 12);
		grocery.put("banana", 3);
		grocery.put("cheese", 4);
		grocery.put("grapes", 3);
		System.out.println(grocery);
		
		
		//create a map of items to by(any item)-by saving an order
		
		Map<String,Integer> household=new LinkedHashMap<>();
		household.put("lysol", 3);
		household.put("sanitizer", 1);
		household.put("paper towel", 4);
		household.put("toilet paper", 2);
		household.put("face mask", 5);
		System.out.println(household);
		
		//create a map which we store all previous items ascending order
		
		Map<String,Integer> shopping=new TreeMap<>();
		shopping.putAll(grocery);
		shopping.putAll(household);
		
		System.out.println(shopping);
		
		//get all keys
		for(String keys:shopping.keySet()) {
			System.out.println(keys);
		}
		System.out.println("=============get all keys using iterator=====");
		
		//get all keys using iterator
		Iterator<String> it=shopping.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//get all values
		for(int s:shopping.values()) {
			System.out.println("values "+s);
			
	}
		System.out.println("=============get all values by using iterator=====");
		//get all values using iterator
		Iterator<Integer> it1=shopping.values().iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
	}
}
