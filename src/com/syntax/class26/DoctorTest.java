package com.syntax.class26;

public class DoctorTest {

	public static void main(String[] args) {
		Doctor doc=new Doctor();
		doc.setEmail("www.ab.@yahhoo.com ");
		System.out.println(doc.getEmail());
		
		System.out.println("----------");
		
		doc.setEmail("");
		System.out.println(doc.getEmail());

	}

}
