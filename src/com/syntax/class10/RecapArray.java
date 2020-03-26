package com.syntax.class10;

public class RecapArray {
	
	public static void main (String[] args) {
		
        int [] grades=new int[4];
		grades[0]=75;
		grades[1]=75;
		grades[2]=75;
		grades[3]=75;
		
		int average=(grades[0]+grades[1]+grades[2]+grades[3])/4;
		
		System.out.println("Averages grade is "+average);
		
		//shortest way to 
		
		String[] cities= {"Miami", "Ibiza", "Boston", "New York"};
		
		System.out.println("I love "+cities[0]);
		
		int x=1;
		System.out.println(cities[x]);
		x+=2;
		System.out.println(cities[x]);
		
		//how many elements stored in the array
		int arraySize=cities.length;
		System.out.println("Total elements "+arraySize);
		
		//how can we access all elements of my array
		
		for(int i=0; i<arraySize; i++ ) {
			System.out.println(cities[i]);
			
		}
		
		
		
		
		
		
		
	}

}
