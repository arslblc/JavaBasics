package com.syntax.class04;

public class NestedIfContinues {
	
	public static void main(String[] args) { 
		
		//Check if patient has any allergies
				//if no allergies, your are healthy
				//otherwise check if patient has;
				  //orange allergy-->do not eat orange
				  //apple allergy--->do not eat apple
				  //kiwi allergy-->do not eat kiwi
				
		
		boolean allergy=false;
		boolean orange=true;
		boolean apple=true;
		boolean kiwi=true;
		
		if(allergy) {
           System.out.println("please answer below");
           
           if(orange) {
        	   System.out.println("do not eat orange");
           }
            if(apple) {
        	System.out.println("do not eat apple");
        }
            if(kiwi) {
            	System.out.println("do not eat kiwi");
            	
            }
           }

		else {
			System.out.println("you are healthy");
		}
		
	}
	
}
	
		
	
		

		
			
			   
		   
		  
		   
	
		
			
	    

	    	
	    
			
	


