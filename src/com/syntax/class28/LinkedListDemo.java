package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> llist=new LinkedList<>();
		llist.add("Yunus");//comes from collectiom
		llist.add(0,"Emre");//comes from the list
		llist.add("Safiye");
		llist.add("Leyla");
		
		int size=llist.size();
		System.out.println(size);
		//get all elements with 3 different types
		
	for(int x=0; x<llist.size(); x++) {
		System.out.println(llist.get(x));
	}
	System.out.println("====================");
		for(String s:llist) {
			System.out.println(s);
		}
		System.out.println("=========ITERATOR===========");	
		Iterator<String>  it=llist.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str);
		}
	//we can store user defined objects
	
	LinkedList<Food> food=new LinkedList();
    food.add(new Soup("Mercimek","tomato and cucumber",100 ));
	food.add(new Salad("Sezar", "iceberg adn tomato", 50));
	food.add(new Dessert("muss","chocolate",450));
		
	for(Food f:food) { 
		f.calories();
		f.foodType();
		f.ingredient();
		
		System.out.println("=================");
		
	}
		
	}
		
		
	}


