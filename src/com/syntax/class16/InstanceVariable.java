package com.syntax.class16;

public class InstanceVariable {
	
	String name="John";//instance variable- inside the class outside of any method
	
	public static void main (String[] args) {
		
		String name="Yunus";
		System.out.println(name);
		
		InstanceVariable obj=new InstanceVariable();//i can access instance variable by creating object
		System.out.println(obj.name);
		
		obj.name="Ali";
		System.out.println(name);
		System.out.println(obj.name);
		
		//change value of local variable
		
		name="Lilly";
		System.out.println(name);
		
		
	}
	

}
