package com.syntax.class24;

public abstract class Vehicle {
	
	static int totalVehicles;
	String color;
	String carType;
	Vehicle(String color){
		this.color=color;
		totalVehicles++;
	}
	public static void total() {
		System.out.println("we build "+totalVehicles);
	}
	
	
	public void drive() {
		System.out.println("Vehicle drives");
	}
	public void stop() {
		System.out.println("Vehicle stops");
	}
	public abstract void start();
	public abstract void brake();

}
abstract class Car extends Vehicle{

	Car(String color, String carType){
		super(color);
		this.carType=carType;
	}
public void brake() {
	System.out.println(carType+ " has brakes");
}
	
}
 
class Tesla extends Car{
	
	Tesla(String color, String carType,String make) {
		super(color, carType);
		this.make=make;
		
	}

	String make;

	public void start() {
		System.out.println(make+ " starts remotely");
	}
	public void drive() { 
		System.out.println(" ");
	}
	
	public void display() {
		System.out.println("we have "+color+make +carType);
	}
}

class Toyota extends Car{
String make;
	
	Toyota(String color, String carType, String make) {
		super(color, carType);
		this.make=make;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println(make+ " starts without key");
	}
	
}

