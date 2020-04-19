package com.syntax.class19;

public class ConstructorCall {
	//constructor chaining(constructor inside another constructor)
	
	public ConstructorCall() {
		System.out.println("i am non argument constructor");
	
	}
public ConstructorCall(String str){
	this();
}
public ConstructorCall(String str, String str1) {
	this("Hello");

}



public static void main(String[] args) {
	//creating an object by pasing two string values
	ConstructorCall obj=new ConstructorCall("Java","Love");
	
}
}
