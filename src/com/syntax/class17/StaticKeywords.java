package com.syntax.class17;

public class StaticKeywords {
	
	String color;
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	static void displayGeneral() {
		System.out.println("We are building "+brand+" with touch Screen "+touchScreen);
	}
	void displaySpecifications() {
		System.out.println("We are building "+memory+" with color "+color);
	}
	public static void main(String[] args) {

		brand="Iphone";
		touchScreen=true;
		
		StaticKeywords obj=new StaticKeywords();
		obj.color="white";
		
		
		
	}
	
	
	
}


