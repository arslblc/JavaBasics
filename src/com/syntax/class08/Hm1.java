package com.syntax.class08;

import java.util.Scanner;

public class Hm1 {
	public static void main (String[] args) {
//Print numbers from 1 to 50 except those that are divisible by 3


//Create a program that will be asking user to apply for a credit card 10 times. 
//As soon you get an “yes” from a user program should stop asking.

	//task1
		
		for(int i=1; i<=50; i++) {
			if(i%3==0 ) {
				continue;
			}
			System.out.println(i);
		}
		
		//task 2
		Scanner scan=new Scanner(System.in);
		String decision=null;
		
		for(int i=1; i<=10; i++) {
		System.out.println("Please apply for a credit card");
		decision = scan.nextLine();
        if (decision.equalsIgnoreCase("Yes")) {
            System.out.println("Congrat! you apply credit card");
            break;
            
        }

	}
	}
}
