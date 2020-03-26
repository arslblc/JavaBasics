package com.syntax.class08;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		//Write a program that reads a range of integers 
		//(start and end point), provided by a user 
		//and then from that range prints 
		//the sum of the even and odd integers.
		
		
		Scanner scan=new Scanner(System.in);
		int sumEven=0;
		int sumOdd=0;
		
		System.out.println("What is starting Point?");
		int Spoint=scan.nextInt();
		
		System.out.println("What is ending Point?");
		int Epoint=scan.nextInt();
		
		for(int i=Spoint; i<=Epoint; i++) {
			if(i%2==1) {
				sumOdd=i+sumOdd;
				
				
			}else {
				sumEven=sumEven+1;
			}
			System.out.println(sumOdd);
			System.out.println(sumEven);
		}

		
		

	}

}
