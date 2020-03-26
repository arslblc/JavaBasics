package com.syntax.class10;

public class RetrieveValues {

	public static void main(String[] args) {
		
		char[] grades= {'A', 'B','C','D','E', 'F'};
		
		int arraySize=grades.length;
		
		//getting all elements;
		
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
			
		}
		System.out.println("-----------printing using advanced for loop---------");
            for(char puanlar:grades) {
        		System.out.println(puanlar);
            }	
        		//create an array of fruites and retrieve all elements
        	System.out.println("-----------advanced for loop,enhanced for loop,for each loop---------");
        		
        		String[] fruits= {"apple", "banana","mago", "kiwi"};
        		
  
        		
        		for(String meyve:fruits) {
        			System.out.println(meyve);
        			
        		}
        		System.out.println("-----------regular for loop---------");	
        		
        		for(int i=0; i<fruits.length; i++) {
        			System.out.println(fruits[i]);
        		}
    			
	
	
}
	}

