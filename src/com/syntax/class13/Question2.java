package com.syntax.class13;



public class Question2 {
	public static void main (String [] args) {
		//Write a java program to check whether a given number is prime or not?
//divisible by1 and itself only
		

		int given=2;
		boolean isPrime=true;
		
		if(given>1) {
			 for(int x=2; x<given; x++) {
				 if(given%x==0) {
					 isPrime=false;
					 break;
				 } 
			 }
			
		} else {
			isPrime=false;
		}
		
		System.out.println("Given number "+given+ " is prime ? "+isPrime );
		
		
	}

}
