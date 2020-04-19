package com.syntax.class22;

public class Employee {

	double salary;
	
	void getPaid() {
		System.out.println("Employee is paid "+salary);
	}
	void work() {
		System.out.println("Employee works");
	}
}

class FullTimeEmployee extends Employee{
	
	
	}


class PartTime extends Employee{
	
}

class Contractor extends Employee {
	
	double hourly;
	void getPaid() {
		System.out.println("Employee is paid "+hourly);
}
	}
