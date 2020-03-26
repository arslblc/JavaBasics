package com.syntax.class13;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java Program to print first 10 numbers of Fibonacci series.
        //sum of previous numbers will give me fibonacci numbers
		int a,b,c;
		a=0;
		b=1;
	
		for(int x=1; x<=10; x++) {
			System.out.println(a+ " ");
	    c=a+b;
        a=b;
	    b=c;
	    
		}

	}

}
