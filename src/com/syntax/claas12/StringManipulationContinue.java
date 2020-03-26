package com.syntax.claas12;

public class StringManipulationContinue {
	public static void main (String[] args) {
		
		System.out.println("======subcstring() FUNCTION====");
		
		String str="Today is rainy day";
		//we can retrieve a part from your string with substring
		
		String partial=str.substring(6);
		System.out.println(partial);
		
		String partial2=str.substring(9);
		System.out.println(partial2);
		
		//today
		
		System.out.println(str.substring(0, 6));
		
	}

}
