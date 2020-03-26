package com.syntax.class07;

public class Task04 {
	
	public static void main (String[] args) {
		//print odd numbers btw 20-50 (2 ways)
		//ever time put num++ outside the if braces
		
		int num=20;
		
		while(num<=50) {
			
			if(num%2==0) {
				System.out.println(num);
			}num++;
			
		}
		System.out.println("$$$$$$$$$$$$");
		
		//second way
		
		int num2=20;
		
		while (num2<=50) {
			System.out.println(num2);
			
		}num++;

	}
}
