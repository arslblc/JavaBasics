package com.syntax.class08;

public class NestedLoop {
	public static void main(String[] args) {
		//if outer loop is false inner loop will never
		//be executed. For inner loop 
		//outer loops must be true
		
		for(int i=1; i<=3; i++) {
			System.out.println("Hello"); {
				
				for(int y=2; y<=5; y++)
					System.out.println("Bye");
			}
		}
		
				
	}

}
