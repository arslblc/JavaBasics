package com.syntax.class24;

public class VehicleTest {

	public static void main(String[] args) {
		
	//as long as absract class you cannot create object
		Vehicle tesla=new Tesla("black", "sedan", "Tesla");

		tesla.drive();
		tesla.brake();
		tesla.start();
		//tesla.display(); you should define this one in vehicle class(parent class
		
		new Toyota("blue","sedan", "camry");
		new Toyota("black","sedan", "corolla");

		Toyota.total();//same result because it is static variable
		Vehicle.total();//same result
		
 	}

}
