package com.syntax.class18;

public class BestCar {
	
	String make,model,color;
	int year,door,wheels;
	
	public void printDetails(){
		System.out.println("i have "+year+" "+make+" "+model+" in "+color+ " color");
        System.out.println(make+ " has "+door+" doors and wheels "+  wheels);

}
	BestCar(String carMake, String carModel,String carColor, int carYear,int carDoor, int carWheels) {
		make=carMake; //String make create CE because it will become local variable,
		model=carModel;
		color=carColor;
		year=carYear;
		door=carDoor;
		wheels=carWheels;
	}
	
	public static void main (String[] args) {
		BestCar obj=new BestCar("BMW", "M5", "Black", 2020, 4,5);
		obj.printDetails();
	}
	
	}
