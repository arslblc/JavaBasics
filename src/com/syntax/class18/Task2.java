package com.syntax.class18;

public class Task2 {
	
	//write a program that have 4 different access levels of constructors.
	//create 3 objects of this class.
	//1-inside same class-2. from outside class.-3.from different class from different package adn observe result
	
	public Task2(){
		System.out.println("public constructor");
	}
	
	Task2(int num) {
		System.out.println("default constructor");
	}
	
	private Task2(int num1, int num2) {
		System.out.println("private constructor");
	}
	protected Task2(String str) {
		System.out.println("protected constructor");
	}
	public static void main (String[] args) {

		Task2 obj=new Task2();
		Task2 obj1=new Task2(14);
		Task2 obj2=new Task2(15,16);
		Task2 obj3=new Task2("Hello");
	}

}
