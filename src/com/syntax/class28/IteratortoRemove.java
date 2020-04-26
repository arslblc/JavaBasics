package com.syntax.class28;

import java.util.ArrayList;

public class IteratortoRemove {
	public static void main(String[]args) {
		
		ArrayList<String> drinks=new ArrayList();
		drinks.add("milk");
		drinks.add("milk");
		drinks.add("water");
		drinks.add("tea");
		drinks.add("tea");
		drinks.add("coffee");
		
		for(int x=0; x<drinks.size(); x++) {
			if(drinks.equals("milk") || drinks.equals("tea"));
			drinks.remove(x);
		}	
		System.out.println(drinks);
	}

}
