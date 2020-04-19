package com.syntax.class22;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee obj=new Employee();
		obj.salary=8000;
		obj.getPaid();
		
		FullTimeEmployee obj1=new FullTimeEmployee();
		obj1.salary=5000;
		obj1.getPaid();
		
		Contractor ct=new Contractor();
		ct.hourly=50;
		ct.getPaid();
	}

}
