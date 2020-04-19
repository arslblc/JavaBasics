package com.sytax.class21;

public class ProgrammingLanguage {
	
	
	String variable;
	String name;
	
public ProgrammingLanguage(String name, String variable) {
	
	this.name=name;
	this.variable=variable;
		
	}

}

class Java extends ProgrammingLanguage{ 
	
	String constructor;
	
	Java(String name,String variable, String constructor){
		super(name,variable);
		this.constructor=constructor;
	}
	
	public void detail() {
		System.out.println("Programming language can have "+name+" and variables "+variable+" and constructor "+constructor);
	}
	
}

