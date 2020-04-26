package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[]args) {
		
	ArrayList<String> arraylist=new ArrayList<>();//collection type
	//adding string object to my arraylist
	arraylist.add("John");
	arraylist.add("Sarah");
	
	//access elements from arraylist
	String secondElement=arraylist.get(1);
	System.out.println(secondElement);
	
	//add elemetns
	arraylist.add("Leyla");
	arraylist.add("Ceyda");
	//how to get numbers of elements from arraylist
int size=arraylist.size();
	System.out.println(size);
	arraylist.remove("John");
	System.out.println(arraylist.size());
	
	arraylist.add("Derya");
	System.out.println(arraylist);
	arraylist.set(0,"Miram");
	System.out.println(arraylist);
	
	//how to retrieve arraylist 1 by 1
	
	for(int x=0; x<arraylist.size(); x++) {
		String element=arraylist.get(x);
		System.out.println(element);
	}
	System.out.println("-------------");//enhanced fo loop
	
	for(String c:arraylist) {
		System.out.println(c);
	}
	}

}
