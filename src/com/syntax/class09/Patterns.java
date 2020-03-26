
package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {

		
		for(int a=0; a<=5; a++) {
			
				System.out.print("*");
			
		}
		System.out.println(); //to seperate ****** from ***** this one.
		for(int a=0; a<=5; a++) {
			
				System.out.print("*");
			
		}System.out.println();
		for (int b=0; b<=5; b++) {
			System.out.print("*");
		} 
		
System.out.println("-----PRINTING PATTERN BY USING NESTED LOOP-----"); 


	
	for(int a=0; a<4; a++ ) {
      for(int b=0; b<=4; b++) {
    	  System.out.print("*"); 
    	  }
      System.out.println();
      }
	
	System.out.println("-------NEW EXAMPLE--------");
	
	
	for(int x=0; x<10; x++) {
		for(int y=0; y<10; y++) {
			System.out.print("*") ;
		}
		System.out.println();
	}
	
	System.out.println("-------NEW EXAMPLE--------");
	
	
	for(int w=0; w<5; w++) {
		for(int q=1; q<=5; q++) {
			System.out.print(w);
		} 
		System.out.println();
		}
	System.out.println("-------NEW EXAMPLE--------");
	
	for(int f=5; f>0; f--) {
		for(int k=5; k>0; k--) {
			System.out.print(k) ;
		} 
		System.out.println();
		
	
	}
	
	System.out.println("-------NEW EXAMPLE--------");
	///#of columns dependant to # of rows. 
	//#of columns never exceed #of rows.
 //rows is inner loop
	//columns is outer loop.
	
	for(int a=1; a<=4; a++) {
		for(int k=1; k<=a; k++) {
			System.out.print("*"); 
		}
		System.out.println();
	}
	System.out.println("-------NEW EXAMPLE--------");
	
	for(int a=5; a>=0; a--) {
		for(int k=1; k<=a; k++) {
			System.out.print("*"+" "); 
		}
		System.out.println();
	}
	
	
	
	
	}
}
