package com.syntax.Class20;



public class CarTest {
	
	public static void main(String[] args) {
		
		Car car=new Car();
		
		System.out.println("================");
		
		Mercedes mrc=new Mercedes();
		mrc.display();
		
		Mercedes mrc1=new Mercedes("Mercedes ","M", "NO AMG");
		mrc1.display();
		
		Mercedes mrc2=new Mercedes("Mercedes ","GLK", "AMG");
		mrc2.display();

	}

}
