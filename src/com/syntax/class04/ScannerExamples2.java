package com.syntax.class04;

import java.util.Scanner;

public class ScannerExamples2 {
	
	public static void main(String[] args) {
		//capture a name from a user
		//print in the format
		//my name is____
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String name=scan.nextLine();
		
		System.out.println("My name is "+name);
		
		System.out.println("How old are you?");
		
		int age=scan.nextInt();
		
		System.out.println("my name is "+name+" my age is "+age);
		
		System.out.println("End of the program");
	}

}
