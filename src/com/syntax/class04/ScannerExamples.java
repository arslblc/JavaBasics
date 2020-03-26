package com.syntax.class04;

import java.util.Scanner;

public class ScannerExamples {
	
	public static void main (String[] args) {
		
		
		Scanner scan=new Scanner(System.in);// as soon as i used this one i can put anything
		System.out.println("Please give any text");
		String txt=scan.nextLine();
		
		System.out.println(txt);
		
		System.out.println("please give me any number");
		
		int a=scan.nextInt();
		
		System.out.println(a);
		
		
		System.out.println("End of the program");
		
		
		
		
	}

}
