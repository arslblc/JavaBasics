package com.syntax.class25;

public interface Drivable {
	
	public static final boolean MOVE_FAST=true; 

 void drive();
 public void hello();
 
 abstract class Vehicle{
	 void stop() {
	}
 
 public class araba extends Vehicle implements Drivable {

	@Override
	public void drive() {
		System.out.println("car drives");
		
	}

	@Override
	public void hello() {
		System.out.println("car cannot say hello");
		
	}
 }}}
	 


