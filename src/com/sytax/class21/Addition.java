package com.sytax.class21;

public class Addition {
	
	//method overloading by changing number of parameters
	
	void display(int num, int num1 ) { 
		System.out.println(num+num1);
	}
	void display(int num, int num1, int num2 ) { 
		System.out.println(num+num1+num2);
	}
	
	void display(int num, int num1, int num2, int num3 ) { 
		System.out.println(num+num1+num2+num3);
	}
	
	void display(double num, int num1) { 
		System.out.println(num+num1);
	}
//another method overloading way by changing the type of parameters

}
