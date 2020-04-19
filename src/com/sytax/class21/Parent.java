package com.sytax.class21;

public class Parent {

	String name="Farid";
	String lastName="Smith";
	
	void hello() {
		
		System.out.println("i m parent class method");
	}
	
	
	
	
}
class Child extends Parent{
	
	String name="Ahmet";
	
	public void display() {
		System.out.println(this.name);
		System.out.println(lastName);
		System.out.println(super.name);
		
		
	}
	 void sayHello() {
		 display();
		 hello();
		 
	 }
	
}