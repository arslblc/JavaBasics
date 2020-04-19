package com.syntax.class22;

public class OverloadingMainMethod {
	
	public static void main(String[] args) {
		System.out.println("Method with array argument");//only this method signature to print 
		OverloadingMainMethod.main("str");
		main("str", "hello");
		main("str");
		main(12);
		
	}

	public static void main(int args) {
		System.out.println("method is int");
	}
	
	public static void main(String args) {
		System.out.println("method is String argument");
	}
	public static void main(String args1, String str) {
		System.out.println("method is 2 String arguments");
	}
}
