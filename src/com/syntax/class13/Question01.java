package com.syntax.class13;

public class Question01 {
	public static void main (String[] args) {
		//Write a program to swap 2 numbers without a temporary variable?
		//Swap  2 strings without a temporary variable?
		//without temporary variable means you cannot implement another variable, just 2 variables
		
		int a = 10;
		int b = 20;
		

	a=a+b;//30
	b=a-b;//10
	
	a=a-b;
	
	System.out.println("The value of a = "+a);
	System.out.println("The value of b = "+ b);

	String str1="Hello";
	String str2="Bye";
	
	str1=str1+str2;//DayNight
	str2=str1.substring(0,str1.length()-str2.length());//Day
	str1=str1.substring(str2.length());
	System.out.println("value of str1 ="+str1);
	System.out.println("value of str2 ="+str2);
	
	//another wat
	String str3="Hello";
	String str4="Bye";
	
	String shorterstr1=str3+str4;
	
	str4=shorterstr1.replace(str4, " " );
	str3=shorterstr1.replace(str3, "");
	
	System.out.println(str3);
	System.out.println(str4);
	}
	

}
