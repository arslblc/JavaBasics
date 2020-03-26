package com.syntax.class03;

public class TemperatureCheck {
	
	public static void main (String[] args) {
		
		double storeTemperature=45;
		
		if (storeTemperature<32) {
			System.out.println("Water will freeze with temperature "+storeTemperature);
		} else {
			System.out.println ("Water will not freeze with temperature "+storeTemperature);
			
		}
	}

}
