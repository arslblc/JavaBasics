package com.syntax.class29;

import java.util.HashMap;

public class MapIntro {
	public static void main (String[]args) {
		
	HashMap<String,String>	hmap=new HashMap<>();
	//to store values into Map we use
	
	hmap.put("Name", "John");
	hmap.put("Lastname","Smith");
	hmap.put("Address","123 Street");
	hmap.put("City", "Plano");
	
	//how to check map has any value?
	boolean isEmpty=hmap.isEmpty();
	System.out.println("map is empty" +isEmpty);
	
	//how many elements in Map
	int sizeMap=hmap.size();
	System.out.println(sizeMap);
	
	//we can add more values
	hmap.put("marital status", "married");
	
	System.out.println(sizeMap);
	
	//can we store duplicate value? NO
	hmap.put("Name","Lilly"); 
	
	//how can we acces the value
	System.out.println(hmap.get("Name"));
	
	//we can remove the value
	hmap.remove("Address");
	System.out.println(hmap);
	
	//rteplace the value
	hmap.replace("marital status", "not married");
	System.out.println(hmap);
	
	}

}
