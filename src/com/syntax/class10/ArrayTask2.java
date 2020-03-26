
package com.syntax.class10;

public class ArrayTask2 {
	public static void main (String[] args) {

		int[] numbers= {1,2,3,4,5};
		int sum=0;
		
		for(int i:numbers) {
        sum+= i;
		
	}
		System.out.println(sum);
		
		System.out.println("===================");
	
	int sum1=0;
	for(int i=0; i<numbers.length; i++) {
       sum1+=numbers[i];
} 
	System.out.println(sum);
	}
	
	}
