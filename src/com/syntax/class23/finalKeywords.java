package com.syntax.class23;

public class finalKeywords {
	
	public static String str="Hello";
	static final String str1="Good Bye";
	

	public static final String APPLICATION_URL="http/sytanx.com";
	
	final char Grade='A';
	
	public static void main (String[]args) {
		
		str="Hi";
		
	}
	public final void hello() {
		System.out.println("I am a final method");
	}
	public final void hello(String name) {
		System.out.println(name+"vHello");
		}
	}

class SubClass extends finalKeywords{
	//cannot override final method
	
	public void hello(int num) {
		System.out.println("hello of child class");
	}
}
