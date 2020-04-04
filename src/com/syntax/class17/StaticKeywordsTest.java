package com.syntax.class17;

public class StaticKeywordsTest {

	public static void main(String[] args) {
		//access static members of another class
		
		StaticKeywords.brand="Android";
		StaticKeywords.touchScreen=true;
		StaticKeywords.displayGeneral();
		
		StaticKeywords obj1=new StaticKeywords();
		obj1.color="red";
		obj1.memory=128;
		obj1.displaySpecifications();
	}

}
