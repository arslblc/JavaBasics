package com.syntax.Class20;

public class Employee {

	protected static String company;
	
	protected int empNumber;
	double salary;
	
	void getPaid() {
		System.out.println("Employee get "+salary);
	}
	
	static void work() {
		System.out.println("Employee work at "+company);
	}
	
}
