
package com.syntax.Class20;

public class TestClass {
	public static void main(String[] args) {
		ProductOwner po=new ProductOwner();
		po.empNumber=123;
		po.salary=150000;
		ProductOwner.company="Syntax";
		po.ceremonies="Sprint Grooming, Sprint Planning, Sprint Demo, Daily Stand Up";
		po.attendMeeting();
		po.prioritizeBacklog();
		
		ProductOwner.work();
		Employee.work();
		
		
		
		
	}

}
