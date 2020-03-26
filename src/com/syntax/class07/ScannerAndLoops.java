
package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {
		
//we want to ask user's name 5 times and print "Good Afternoon___" 5 times

	Scanner input;
	String name=null;
	int num=6;
	//for 5 times, we need loop
	
	input=new Scanner (System.in);
	
	while(num <= 7) {
	
	System.out.println("What is your name?");
	
	name=input.nextLine();
	
	System.out.println("Good afternoon "+name);
	
    num++;
	
	}
	
	//we are playing lottery and luck number is 17
	//we want to keep asking user any number for 1-20
	//until he guess the lucky number-->congrats
	
        //we are playing lottery and lucky nyumber is 17;
        //we want to keep asking user any number from 1-20
        //until he guess the lucky number then output should be->congrats    
    
	Scanner scan=new Scanner (System.in);
    int number;            
	int luckyNumber=17;
	
	do {
		System.out.println("Please enter any number frim 1 to 20");
		number=scan.nextInt();
	} while (number!=luckyNumber);
	
	System.out.println("Congrats!!!!");
		
	}
	
	//ask the question till bla bla diyorsa do while
	//if it says 5 times or 7 times just while
	}


	

