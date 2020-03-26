package com.syntax.class11;

public class array2Drecap {
	
	public static void main (String[] args) {
		
		
		        String [][] groceries= {
				{"cucumber","potato", "carrot"},
				{"mango","apple","banana","kiwi"},
				{"milk","cheese","yogurt"}
		};
				System.out.println(groceries[1][2]);
	
	
		//get all values from 2d array
	for(int i=0; i<groceries.length; i++) {
		
  for(int y = 0; y<groceries[i].length; y++) {
	  
	  System.out.print(groceries[i][y]+" ");
  }
	System.out.println();	
		
	}
	System.out.println("================GETTING ELEMENTS USING ADVANCED FOR LOOP");	
	
	for(String [] array:groceries) {
		for(String items:array) {
			System.out.print(items+" ");
		}
		System.out.println();
	}
	}


}