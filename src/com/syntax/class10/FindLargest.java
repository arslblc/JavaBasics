package com.syntax.class10;

public class FindLargest {
	public static void main (String[] args) {
		//find largest element from an array
		
		int[] numbers= {1,500,76,465,-1,17};
		
		int largest=numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			
		}
		
		System.out.println(largest);
		
	}

}
