package com.syntax.class11;

import java.util.Scanner;

public class NewTask {
	public static void main (String[] args) {
		
	Scanner scan;
	String username;
	String password;
	String confirmedPassword;
	String message=null;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter your username");
	username=scan.nextLine();
	
	System.out.println("Please enter your password");
	password=scan.nextLine();
	
	if(!(username.isEmpty() || password.isEmpty())) {
		 if(password.length()>=8) {
			 
			 if(!password.contains(username)) {
				 System.out.println("confirm password");
				 confirmedPassword=scan.nextLine(); 
				 
					 if(confirmedPassword.equals(password)) {
						 System.out.println("Your account is created");
					 }else {
						 System.out.println("password do not match");
					 }
				
				 
				 
			 }else {
				 System.out.println("password cannot contain username");
			 }
			 
			 
		 }else {
		System.out.println("Password is too short");
		 }
		
	
	} else {
			message="Username and password cannot be empty";
		}
	
	System.out.println(message);
		
		
		
		
		
	}
}
