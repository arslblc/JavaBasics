package com.syntax.class26;

public class EncapsulationTest {

	public static void main(String[] args) {
	
		Employee emp=new Employee();
        emp.setName("Lilly");//with the help of setters i can set value- access indirectly
        System.out.println(emp.getName());
	}

}
