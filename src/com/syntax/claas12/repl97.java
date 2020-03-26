package com.syntax.claas12;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String givenString = inp.nextLine();
   	//write your code below
    String rev="";
	 
   	String s=givenString.replaceAll("[^A-Za-z]","") ;
	   
	    for(int i=s.length()-1;i>=0; i--)
	    	rev=rev+s.charAt(i);
	    
	    	if(s.equalsIgnoreCase(rev))
	    		System.out.println(true);
	    		else
	    		System.out.println(false);
  }
   	
  }

