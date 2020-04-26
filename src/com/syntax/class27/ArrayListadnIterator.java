package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListadnIterator {
	public static void main(String[]args) {
		//lets create arraylist of chocolate
		ArrayList<String> choco=new ArrayList();
		choco.add("ulker");
		choco.add("eti");
		choco.add("damak");
		choco.add("kinder");
		
		//create arrayList of sweets
		
		ArrayList<String> sweet=new ArrayList();
		sweet.add("ice cream");
		sweet.add("cake");
		sweet.addAll(choco);
		System.out.println(sweet);
		
		
		
		Iterator<String> it=sweet.iterator();
		
		////iterates in one direction
		if(it.hasNext()) {
			String element=it.next();
			if(element.equals("ice cream")){
				it.remove();
			}
			System.out.println("after remove ice cream");
			System.out.println(sweet);
			
		//get elements backwards
			
			for(int x=sweet.size()-1; x>0; x--) {
				System.out.println(sweet.get(x)+";");
				
			}
	//advanced for loop
	//iterates in one direction
			for(String x:sweet) {
				System.out.println(x);
			}
		}
		
		
		
	}

}
