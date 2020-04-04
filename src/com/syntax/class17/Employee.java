package com.syntax.class17;

public class Employee {
	
	//create variables to hold name, last name, title, social security, salary 
	
	public static String title;// accessible everywhere
	
	public String name;//accessible everywhere
	
	protected String lastName;// accessible within same package 
	
	double salary;
	
	private long ssn;//accesible only within the same class
	
	public static void method1 () {
		
		System.out.println("I m public method");
	}
	protected void method2() {
		System.out.println("I m protected method");
	}
	void method3() {
		System.out.println("I m default method");
	}
	
	private void method4() {
		System.out.println("This private method");
	} 
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.name="John";
	emp.lastName="Smith";
	emp.salary=90000;
	emp.ssn=97564;
	
	//accessing all methods
	method1();
	
	emp.method2();
	emp.method3();
	emp.method4();
}
}
