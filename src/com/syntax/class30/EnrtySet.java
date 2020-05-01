package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EnrtySet {

	public static void main(String[] args) {
		
		Map<String,String> land=new TreeMap<>();
		land.put("Togo","Lome");
		land.put("Jamaica","Kingston");
		land.put("Iran","Tehran");
		land.put("Peru","Lima");
		land.put("Cuba","Havana");
		
		System.out.println(land);
		//storing all Entry Objects into a set
		Set<Entry<String,String>>allEntries=land.entrySet();
		System.out.println(allEntries);
		
		//loop through all entries to get key and value
		for(Entry<String,String> a:allEntries) {
			System.out.println(a.getKey());
			System.out.println(a.getValue());
		
		
		}
		
		System.out.println("==========iterate through all entries to get a key and value");
		
		Iterator<Entry<String,String>> it=allEntries.iterator();
		while(it.hasNext()){
			Entry<String,String>  e=it.next();
		String	result=e.getKey()+": : :"+e.getValue();
			System.out.println(result);
		}
		
		
	}

}
