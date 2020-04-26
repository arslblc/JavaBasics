package com.syntax.class29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {
	public static void main(String[]args) {
		
		Set<String> veggies=new HashSet<>();//it does not care the order we set-duplicate is not allowed
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("carrot");
		
		System.out.println(veggies);
		
		Set<String> fruit=new LinkedHashSet<>();//order is important-no duplicate
		fruit.add("apple");
		fruit.add("mango");
		fruit.add("pear");
		fruit.add("kiwi");
		fruit.add("mango");
		fruit.add("tomato");
		fruit.add("banana");
		
		System.out.println(fruit);
		
		Set<String> obj=new TreeSet<>();
		obj.addAll(veggies);
		obj.addAll(fruit);
		System.out.println(obj);
		
		
	}

}
