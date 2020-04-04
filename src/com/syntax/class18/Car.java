package com.syntax.class18;

public class Car {
	
	String make,model,color;
	int year;
	
	public void display() {
		System.out.println("I have "+year+" "+make+" "+model+" in "+color);
	}
	
	public static void main (String[] args) {
		Car obj=new Car();//constructore initialize our objects, we use instance variable without assignin any value
		//constructor initializes all instance variabke assign default value, 
		obj.display();
		System.out.print(obj.make);
		
		
		//int door;--->local variables must be initialized,  
		//System.out.println(door);
	}
	
	

}
