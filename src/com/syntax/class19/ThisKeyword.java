package com.syntax.class19;

public class ThisKeyword {
	
	int a;//instance variable
	int b;
	
	public ThisKeyword() {
		System.out.println("i am non argument constructor");
	}
	
	public ThisKeyword(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public void sum(int a, int b) {
		//sum of which variables am i calculating
		System.out.println("sum of my local variables "+(a+b));
		System.out.println("sum of my instance variables "+(this.a+this.b));
	}//this we are accessing instance variable
	
	public static void main(String[] args) {

		ThisKeyword obj=new ThisKeyword(10,20);
		obj.sum(100,200);
		
		System.out.println("=======================");
		ThisKeyword ob1=new ThisKeyword();
		ob1.sum(20,40);
	}

}
