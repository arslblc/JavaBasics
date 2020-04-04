package com.syntax.class17_1;

import com.syntax.class17.Employee;

public class AccessingMembersOfDifferentClass {
	
	public static void main (String[] args) {
		
	Employee emp=new Employee();
	emp.name="Ahmet";
	Employee.title="CEO";
	
	Employee.method1();//static oldugu icin employee olmali
	emp.method1(); //still accessible with this way
	//protected variable is accessible with same package emp.lastName=
	
	//salary is not accessible- default values only accessible within same package
	
	//below variables are not accessible because of the restrictions
	
	//emp.lastName===>protected, not available
	//emp.salary===>is not accessible due to its default
	//emp.ssn===>private only available within the same class
	
	//below methods cannot accessible due to the restrictions
	
	//method2()
	//method3()
	//method4()
	
		
		

	}
	
	

}
