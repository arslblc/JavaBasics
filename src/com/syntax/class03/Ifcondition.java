package com.syntax.class03;

public class Ifcondition {
	
	public static void main (String[] args) {
		
		//Declare a number and compare if number is larger than 100
		//If number is larger than 100---->my number is large
		
		System.out.println("String coding");
		
		int num=105;
		
		if(num>100) {
			System.out.println("My number is large");
			}
		System.out.println("End of the coding");
		
		System.out.println("----------------");
		
		
		int expectedHours=3;
		int actualHours=4;
		// if actual hours bigger than expected hours "you will love java'
		
		if(expectedHours>actualHours) {
			System.out.println("You will love Java");
			} else {//otherwise (if false)---> go inside else block
			System.out.println("You will not like Java"); }
		
		
		
		
		System.out.println("----------------");
		
		double budget=10000;
		double carPrice=12000;
		
		if(budget>carPrice) {
			System.out.println("I will buy this car today");
		} else {
			System.out.println("I will not buy this car, "+ "i'll learn Java");
			
			
		}
		}
		
		
		
	}


