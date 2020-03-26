

package com.syntax.class08;

public class TaskOdsSum {
	
	public static void main(String[] args) {
		
		//do it again find the problem
		
		 int evensSum=0;
		   int oddsSum=0;
		   
		   for(int i=1; i<=99; i++) {
				 if(i%2==0) {
					 evensSum=evensSum+i;
	    }else {
	    	oddsSum=oddsSum+i;
	    }System.out.println("even total "+evensSum);
	    System.out.println("odd total "+oddsSum);
		
		   }	
	}

}
