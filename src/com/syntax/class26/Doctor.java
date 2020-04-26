package com.syntax.class26;

public class Doctor {
	
	private long licenseId;
	private long phoneNumber;
	private String email;

	public void setEmail(String email) {
		if(!email.isEmpty()) {
			this.email=email;
		
		if(email.contains("gmail")) {
		this.email=email;
	}else {
		System.out.println("email must be gmail");
	}
		
	} else {
		   System.out.println("email cannot be empty");
		}
	}
	
	public String getEmail() {
		return email;
	}
}
