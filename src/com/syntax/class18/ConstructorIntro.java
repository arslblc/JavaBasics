package com.syntax.class18;

public class ConstructorIntro {
	
	
	
	
	
	ConstructorIntro(){
		System.out.println("I have a constructor");
	}
	//to create a constructore 1.name must be same as class name
	                           //2.no return type(not even void))
	
	public static void main(String[] args) {

		ConstructorIntro obj=new ConstructorIntro();
		obj.hello();
		
	}
	void hello() {
		System.out.println("hello");
	}
	

}
