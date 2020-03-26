package com.syntax.claas12;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str="Good morning students";
		
		char letter1=str.charAt(0);
		System.out.println(letter1);
		
		char letter5=str.charAt(4);
		System.out.println("Letter 4 is "+letter5+".");
		
		//get all characters 1 by1
		
		for(int i=0; i<str.length(); i++) {

			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("=======IndexOf() FUNCTION======");

		String name="Syntax technologies";
		int index=name.indexOf("y");
		System.out.println(index);
		
		index=name.indexOf("Syntax");
		System.out.println(index);
		
		index=name.indexOf("!");
		System.out.println("Index of not esxisting characters "+index);
		
		index=name.indexOf("technologies");
		System.out.println(index);
		
		
		
	}

}
