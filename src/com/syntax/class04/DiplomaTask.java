package com.syntax.class04;

public class DiplomaTask {
	
	public static void main(String[] args) {
		boolean diploma=true;
		double gpa=3.80;
		
		if(diploma) {
			System.out.println("congrats");
			if(gpa>3.5) {
				System.out.println("You are eligible for scholarship");
			}else if (gpa<3.5) 
				System.out.println("You should have studied harder");
			} else {
			System.out.println("Get a degree");
			
		}
			
		
	}

}
