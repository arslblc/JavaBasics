package com.syntax.claas12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		String day="Sunday";
		char reverse;
		for(int i=day.length()-1; i>=0; i--) {
			reverse=day.charAt(i); 
				
			System.out.println(reverse);
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your name");
		String name=scan.nextLine();
		 if(!name.isEmpty()) {
			 if(name.length()%2==1 && name.length()>=3) {
				 System.out.println(name.substring(name.length()/2));
			 }else {
				 System.out.println("even numbers of character");
			 }
		 }
	}

}
