package com.syntax.class04;

public class NestedIf {
	
	public static void main (String[] args) {
		
		boolean flag=true;
		boolean classToday=false;
		
		
		if (flag) {
			System.out.println("Hello");
			
			if(classToday) {
				System.out.println("Hello Friends");
		  }else {
			  System.out.println("Bye");
		  }
		}else {
			System.out.println("hohoho");
			}
		
		System.out.println(" out of this if condition");
		
		
		
		
	}
	

}
