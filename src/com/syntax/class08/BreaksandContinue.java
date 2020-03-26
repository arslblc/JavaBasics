package com.syntax.class08;

public class BreaksandContinue {
	public static void main (String[] args) {
		 //once i=4 we want to break the loop
		//rest of the code will be ignored
		
		System.out.println("---BREAK-----");
		for(int i=1; i<=10; i++) {
			if(i==4) {
				System.out.println("I am stopping loop");
				break;
			}
			System.out.println("i am inside the loops");
			System.out.println(i);
		}
		System.out.println("-------CONTINUE-------");
		
		for(int y=1; y<=10; y++) {
			if(y==4) {
				System.out.println("i am skipping iteration");
				continue;
			}
			System.out.println("i am inside the code");
			System.out.println(y);
		}
		
		//print number from 1-20
		//i do not want to print 5,6,7
		System.out.println("------Continue examples-----");
		
		
		for(int z=1; z<21; z++) {
			if(z==5 || z==6 || z==7) {
				continue;
			}
			System.out.println(z);
		}
		
		System.out.println("=======Continue EXAMPLES----");
		
	//write a program that print numbers from 1-100;
	//i do not want to print 35-55
		for(int i=1; i<=100; i++) {
			
			if(i>=35 && i<=55) {
				continue;
			}
			System.out.println(i); //i sorun cikarmiyor cunku parantezlerin
			//icinde diger orneklerde de i kullanabildik o yuzden
		}
		
	}

}
