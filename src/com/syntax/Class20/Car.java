package com.syntax.Class20;

public class Car {
	
	String make, model;
	
	public Car() {
		System.out.println("I am a parent class constructor");
		
	}
	
	public Car(String make,String model) {
this.make=make;
this.model=model;
}
}	
class Mercedes extends Car{
	
	String sportsModel;
	
	//Compiler add super by default!
	public Mercedes() {
		System.out.println("I am a child class constructor");
		
	}
	public Mercedes(String make, String model, String sportsModel) {
		super(make,model);
		this.sportsModel=sportsModel;

	}
	
	public void display() {

System.out.println("I have "+make+" "+model+" "+sportsModel);
	}
	
}
