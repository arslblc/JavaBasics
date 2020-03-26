package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
//hey i wanna verify if you string starts with this value or that value, or they are sane etc
		
		String str1="Welcome Syntax Student";
		String str2="Welcome Syntax student";
		
		System.out.println("========to compare 2string equals() or equalsIgnoreCase()   FUNCTION=====");
		
		boolean compare=str1.equals(str2);
		
		System.out.println(compare); //false bcs case sensitive
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		String expected="Welcome to Syntax";
		String actual="Welcome to Syntax ";
		
		System.out.println("first TRIM and Compare=====");
		
		if (actual.trim().equals(expected)) {
System.out.println("Tes case pass. Titles are matched"); 
		}else {
			System.out.println("Tes case pass. Titles are NOT matched"); 
		}
	}

}
