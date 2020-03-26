package com.syntax.class08;

import java.util.Scanner;

public class HW03 {
	
	public static void main(String[] args) {
		
		
//Write a program to ask a user to enter item they want to buy
//and the price of that item.
//Every time user enters money accumulate the amount
//and tell the user how much is left to pay off the amount. 
//If user give more money program should return a change.
//Whenever a user done with payments program should say
//“Thank you for shopping!”
		
		String item;
		int price;
		int amount=0;
		int money;
		int change;
		int remain;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What do you want to buy?");
		item=scan.nextLine();
		
		System.out.println("What is the price of the "+item);
		price=scan.nextInt();
		
		do {
			System.out.println("Please give money");
			money=scan.nextInt();
			//accumulation
			amount=amount+money;
			
		if(money<price) {
			remain=price-money;
			System.out.println("your remaining balance "+remain);
		}else if (money>price) {
			change=money-price;
			System.out.println("here is your change "+change);
		}else {
			System.out.println("Thank you");
		}
		
		}while(price!=money);
	}
}