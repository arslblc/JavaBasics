package com.syntax.class04;

import java.util.Scanner;

public class CreditCardTask {
	public static void main(String[] args) {
		//has credit card or not
		//if not "would you like to get one?"
		
		//if yes, ask the balance
		//balance>1000, "pay off!"
		//if not "they can spend more"
		
		boolean creditCard=true;
		int balance=500;
		
		if(creditCard) {
			
			
			System.out.println("What is your balance?");
			if(balance>1000) {
				System.out.println("pay off immediately");
			}else {
				System.out.println("you can spend more");
				
				
			}
		}else {
			System.out.println("WOULD YOU LIKE TO GET ONE");
			
		}
				
		
		
		
		
	}

}
