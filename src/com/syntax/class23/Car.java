package com.syntax.class23;

public class Car {
	
	String make;
	 
	public Car(String make) {
		this.make=make;
	}

	public void display() {
		System.out.println("i have "+make);
	}
	
	public void start() {
		System.out.println(make+"Cart starts by turning key ");
	}
}
class BMW extends Car{
	public BMW(String make) {
		super(make);
	}
	
	public void start() {
		System.out.println(make+" starts with by pushing button");
	}
	public void navigate() {
		System.out.println(make+" has navigation system");
	}
}
class Mercedes extends Car {
	public Mercedes(String make) { 
		super(make);
	}
	public void start() {
		System.out.println(make+" starts remotely");
	}
}
class Tesla extends Car{
	public Tesla(String make) {
		super(make);
	}
	public void starts() {
		System.out.println(make+" starts by voice command");
	}
}
class Honda extends Car{
	public Honda(String make) {
		super(make);
	}

}

