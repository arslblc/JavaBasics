package com.syntax.class16;

public class LocalVariables {
	
	void nameInside() {
		
		String name="John"; //this variable name= local bcs 
		
	}
	
	public static void main(String[] args) {

	//	System.out.println(name);// name wont be visible to another method 
		//since its scope only within nameInside method
		
		boolean flag=true;
		
		if(flag) {
			String answer="yes";
			
		}
		//System.out.println(answer);//Scope of variable answer is not visible outside of the block
		
	}

}
