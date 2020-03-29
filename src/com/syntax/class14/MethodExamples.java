package com.syntax.class14;

public class MethodExamples {

	// to create a mthod that will be greeding a person.
	
	void greet() //no parameter 
	{
System.out.println("Hello Sarmad");

	}
	void greet1(String name)//this method has parameter 
	{
		System.out.println("Hello "+name);

			}

	public static void main (String[] args) {
		
		MethodExamples object1=new MethodExamples();
		object1.greet();
		object1.greet1("Leyla");
		object1.greet1("Lily");
		object1.greet1("Sarah");
	}
}
