package com.syntax.class23;

public class CarTest {
	
	public static void main(String[]args) {
		
    Car bmw=new BMW("BMW");
   // bmw.display();
   // bmw.start();
   // bmw.navigate() define method in car class 
	Car tesla=new Tesla("Tesla");
	Car mercedes=new Mercedes("Mercedes");
	Car honda=new Honda("Honda");
	
	Car [] cars={new BMW("BMW"), new Tesla("Tesla"), new Honda("Honda"), new Mercedes("Mercedes")};
	
	for(Car c:cars) {
		c.start();
		c.display();
		System.out.println("-------------------");
	}
	System.out.println("-------------------");
	
	for(int x=0; x<cars.length; x++) {
		cars[x].start();
		cars[x].display();
	}
	
	}

}
