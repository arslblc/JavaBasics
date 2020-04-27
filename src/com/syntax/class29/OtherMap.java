package com.syntax.class29;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OtherMap {

	public static void main(String[]args) {
		
		Map<Integer, String> lmap=new LinkedHashMap();
		
		lmap.put(1000, "John Smith");
		lmap.put(1003,"Faisal Bilir");
		lmap.put(1007,"Lilly Green" );
		
		System.out.println(lmap);
		//order of our entry preserved
		System.out.println("=========================");
		
		//to store objects in a form of K and V and you want to sort your key as ascending order 
		Map<Integer, String> tmap=new TreeMap<>();
		tmap.put(103,"John Smith");
		tmap.put(1004,"Faisal Smith");
		tmap.put(107,"John Green");
		tmap.put(1550,"Ali Malik");
		
		System.out.println(tmap);
		System.out.println("=========================");
		
		//create a map of country and sort countries in alphabetical order 
		
		Map<String, Integer> population=new TreeMap<>();
		population.put("Turkey",7200000);
		population.put("USA",30000000);
		population.put("Russia",5500000);
		population.put("Japan",11000000);
		population.put("Afganistan",2000000);
		
		
		System.out.println(population);
		
		System.out.println(population.keySet());
		System.out.println(population.values());
		System.out.println(population.size());
		
		//how to get all keys
		Set<String> keys=population.keySet();
		
		System.out.println("===============Getting keys by using iterator====");
		
		Iterator<String> keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			String key=keysIt.next();
			System.out.println("key is "+key+ "and its value "+population.get(key));
			
			System.out.println("===============Getting keys by using enhanced loop====");
			
			for(String c:keys) {
				System.out.println("key from population map= "+c+":"+population.get(c));
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
