package com.syntax.class13;

import java.util.Arrays;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a java program to find the second largest number in the array?
		//Maximum and minimum number in the array?
		
		int[] numbers= {32, 61,16,89,74,25};
		Arrays.sort(numbers);
		System.out.println("Smallest "+numbers[0]);
		System.out.println("Biggest "+numbers[numbers.length-1]);
		System.out.println("Second Largest "+numbers[numbers.length-2]);
		
		//Second way;
		
		int[] numaralar= {32, 61,16,89,74,25,89};
		int smallest=numaralar[0];
		int largest=0;
		int largest2=0;
		for(int i=1; i< numaralar.length; i++) {
			int element=numaralar[i]; 
			
				if(element>largest) {
					largest2=largest;
					largest=element;
				}else if (element>largest2 &&element!=largest) {//aynisindan 2 tane daha varsa bu conditioni ekliyoruz
				largest2=element;
				}
				if(element<smallest) {
					smallest=element;
				}
				
			}
			System.out.println("Smallest "+smallest);
			System.out.println("Biggest "+largest);
			System.out.println("Second Largest "+largest2);
			
			
		}
		
		
		
	
		
		
	

}
