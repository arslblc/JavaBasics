package com.syntax.claas12;
import java.util.Scanner; 
public class repl93 {
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter the browser name to proceed further with execution");
		   String browser = sc.nextLine(); 
		  if(browser.equals("ChRoME")) {
		    System.out.println("Proceed with Chrome browser"); }
		      else if (browser.equals("FireFOX")) {
		        System.out.println("Proceed with Firefox browser");
		      }else if (browser.equals("IE")) {
		        System.out.println("Proceed with IE browser");
		      
		      } else {
				    System.out.println("Invalid browser");
					  
			  }
		  }
		  }
		