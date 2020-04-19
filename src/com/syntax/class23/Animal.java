package com.syntax.class23;

public class Animal {
	
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
	
	public void sleep() {
		System.out.println("Animal sleep");

	}
	private void eat() {
		System.out.println("animal eats");
	}

}
class Bird extends Animal{
	
	public static void whoAmI() {
		System.out.println("I am a bird");
	}
	public void sleep() {
		System.out.println("Birds sleeps");
	}
	private void eat() {
		System.out.println("birds eat");
	}
}