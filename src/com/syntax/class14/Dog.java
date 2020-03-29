package com.syntax.class14;

public class Dog {
	String breed;
	String color;
	String name;
	int age;
	
	
	public static void main (String[] args) {
		
		Dog dog1=new Dog();
		dog1.breed="Husky";
		dog1.color="Brown";
		dog1.name="Charlie";
		dog1.age=3;
		
		dog1.eat();
		dog1.bark();
		dog1.run();
		
		Dog dog2=new Dog();
		dog2.breed="Labrador";
		dog2.color="Black";
		dog2.name="Rudy";
		dog2.age=8;
		
		dog2.eat();
		dog2.bark();
		dog2.run();
	}
	
void eat() {
	System.out.println(name+" can eat");
	
}
void bark() {
	System.out.println(name+" can bark");
}
void run() {
	System.out.println(name+" can run");
}



}