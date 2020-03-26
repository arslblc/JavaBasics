package com.syntax.class04;

public class MoreNestedIf {
	
	public static void main(String[] args) {
		
		//declare date and a day.
		//if day is Friday--->if date is 13-->watch a scary movie
		//                --->if date is not 13-->watch a comedy
		
		boolean isFriday=false;
		int date=15;
		
		if(isFriday) {
			System.out.println("go outside and watch a movie");
			
			if(date==13) {
				System.out.println("watch a scary movie");
			}else {
				System.out.println("watch a comedy");
			}
		}else {
			System.out.println("Today is not friday,i m satying home");
			
		}
		}


}
