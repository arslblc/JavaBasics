package com.syntax.class18;

public class ConstructorDemo {
	
	static String str="Hello";
	
	ConstructorDemo(){
		System.out.println("I am your constructor");
		System.out.println("I am Non argument constructor");
	}
	
	ConstructorDemo(String str){
		System.out.println("I am your constructor with 1 string parameter"+str);
	}
	
	ConstructorDemo(String abc, int x){
		System.out.println("I am your constructor with 1 string parameter and 1 integer "+abc+x);
	}
	void ConstructorDemo() { //as soon as we add return type, it becomes method===> this is method so you need to call it explicitly
		System.out.println("I do not know who i am");
	}
	
	
	
	public static void main(String[] args) {
		ConstructorDemo obj=new ConstructorDemo();
		System.out.println(str);
		ConstructorDemo obj1=new ConstructorDemo("Hi guys");
		ConstructorDemo obj2=new ConstructorDemo("Hi girls", 25);
		ConstructorDemo obj3=new ConstructorDemo();
		obj3.ConstructorDemo();
	}

}
