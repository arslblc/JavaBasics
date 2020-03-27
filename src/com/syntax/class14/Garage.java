package com.syntax.class14;

public class Garage {
	
public static void main (String[] args) {
	
	//build individual objects
	
	Car car1=new Car();//new keyword for creating object
	car1.make="Lamborghini";
	car1.model="Gallardo";
	car1.year=2020;
	car1.color="blue";
	car1.accelerate();
	car1.stop();
	car1.makeNoise();
	
	Car car2=new Car();
	car2.make="BMW";
	car2.model="GLK";
	car2.year=2019;
	car2.color="Black";
	car2.accelerate();
	car2.stop();
	car2.makeNoise();
	
	Car car3=new Car();
	car3.make="Porsche";
	car3.speed=200;
	car3.accelerate();
	car3.stop();
	car3.makeNoise();
	
	//print BMW

	
	
	
}
	

}
