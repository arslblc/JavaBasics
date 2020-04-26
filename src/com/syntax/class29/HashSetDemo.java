package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// create a collection that will store only unique objects and we do not care about order
		
		HashSet<String> breakfast=new HashSet();
		breakfast.add("eggs");
		breakfast.add("bread");
		breakfast.add("tea");
		breakfast.add("creme cheese");
		breakfast.add("eggs");//it will not show this one in the size because duplicate is prohibited
		breakfast.add("coffee");
		
		//How many elements in the set?
		
		int size=breakfast.size();
		System.out.println(breakfast);
		
		//retrieve all elements
		
		Iterator<String> myIterator=breakfast.iterator();
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		
		//we cannot use for loop to retrieve elements
		
		//advanced for loop/enhanced/ for each loop
		
		System.out.println("==========================");
		for(String c:breakfast) {
			System.out.println(c);
		}
		
		
		
		

	}

}
