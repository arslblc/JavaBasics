package com.syntax.Class20;

public class Doctor {
	
	String name;
	int doctorId;
	
	public Doctor(String name, int doctorId) {
		this.name=name;
		this.doctorId=doctorId;
	}

}

class Dentist extends Doctor{
	
 Dentist(String name, int doctorId){
	 
	 //compiler will not try to make a call to parent class constructor. you are responsible to to that
	 // by passing values to super()keyword as in the below
	 super(name,doctorId);
 }
	
}
