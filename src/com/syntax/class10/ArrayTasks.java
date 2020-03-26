package com.syntax.class10;

public class ArrayTasks {
	public static void main (String[] args) {
		
		String[] animals=new String[6];
		animals[0]="rabbit";
		animals[1]="cat";
		animals[2]="dog";
		animals[3]="squirrel";
		animals[4]="bird";
		animals[5]="flamingo";
		
		int arraySize=animals.length;
		
		System.out.println(arraySize);
		
		//advanced for loop
		
		for(String hayvanlar:animals) {
			System.out.println(hayvanlar);
			
		}
		
		//for loop
		
		 System.out.println("---------for loop-------");
		 
		 
		  for(int i=0; i<arraySize; i++) {
			  System.out.println(animals[i]);
		  }
		  
		  System.out.println("================NEW TASK============");
		  
		  int [] numbers= {1, 2, 3, 4, };
		  int  sum=numbers[0]+numbers[1]+numbers[2]+numbers[3]; 
		  
		  System.out.println(sum);
		
	
	 System.out.println("================NEW TASK============");
	 
	
	
	
    
	}}
	
	
		  


