package com.syntax.class19;

public class TestClass {
	
	public static void main(String[] args) {
		//access variables from own class and parent class
		Dog01 dog=new Dog01();
		dog.breed="Husky";
		dog.color="grey";
		dog.fur="too much";
		dog.size="big";
		
		//access method from oen class
		dog.bark();
		
		//access method from parent class
		dog.beWild();
		dog.eat();
		dog.sleep();
		dog.age=2;
		dog.display();
		
		System.out.println("===============");
		
		Animals type=new Animals();
		type.color="any";
		type.fur="no";
		type.size="any";
		
		type.sleep();
		type.eat();
		type.beWild();
	//parent class cannot access child features and behaviors	type.breed=. Your child is selfish
		
		
		

	}
	

}
