package com.syntax.class30;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store{
	
	String type,name;
	
	public Store(String type, String name) {
     
		this.name=name;
		this.type=type;
}
	
	public void display() {
		System.out.println("This is store "+name);
	}
	public abstract void workingHours();
}
class Nike extends Store{

	public Nike(String type, String name) {
		super(type, name);
		
	}

	@Override
	public void workingHours() {
		System.out.println(name+"works from 10 am till 6 pm");
		
	}
	
}

class Costco extends Store{

	public Costco(String type, String name) {
		super(type, name);
		
	}

	@Override
	public void workingHours() {
		System.out.println(name+"works from 10 am till 8 pm");
		
	}
}

class Amazon extends Store{

	public Amazon(String type, String name) {
		super(type, name);
		
	}

	@Override
	public void workingHours() {
		System.out.println(name+"works 24/7");
		
	}
	
}
public class UserDefinedClassesInMap {
	
	public static void main(String[]args) {
		//we want to store stores in from1-Costco2-amazon-3-Nike
		
		Map<Integer,Store> stores=new LinkedHashMap<>();
		stores.put(1,new Amazon("online", "Amazon"));
		stores.put(2, new Costco("wholesale","Costco"));
		stores.put(3,new Nike("retail","Nike"));
		
		System.out.println(stores);
		
		//to get an access to all methods of our store objects; .values(), .keySet(), .entrySet();
	    //1. way ----> get all values objects
		Collection<Store> col=stores.values();
		for(Store s:col) {
			s.workingHours();
			s.display();
			System.out.println("========USING ENTRY SET========");
		}
		
		//2.way to get all entry objects===>getValue;
		
		Set<Entry<Integer,Store>> storeSet=stores.entrySet();
		for(Entry<Integer, Store> entry:storeSet) {
			entry.getValue().workingHours();
			entry.getValue().display();
			System.out.println("==============");
			
		}
		
	//3. WAY---->	get all keys-->get value of specified key
		
		Set<Integer> keys=stores.keySet();//collection
		for(Integer k:keys) {
        Store obj=stores.get(k);
		   obj.display();
		   obj.workingHours();
		}

}
}