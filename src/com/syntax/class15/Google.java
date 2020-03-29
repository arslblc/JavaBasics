package com.syntax.class15;

public class Google {
	//define features such as, id , name, last name, salary
	//define a behavior; working, getting paid, attending meetings
	
	int id;
	double salary;
	String name;
	String lastName;
	String title;
	
	
	void working() {
		System.out.println(title+" is working");

	}
	void getPaid() {
		System.out.println(name+" is getting paid");
	}
	
	void attendMeeting() {
		System.out.println(name+" is attending meetings");
	}
	
	public static void main (String[] args) {
		Google p1=new Google();
		p1.name="Arsel";
		p1.lastName="Balci";
		p1.title="CEO";
		p1.salary=20000000;
		p1.id=001;
		
		p1.getPaid();
		p1.working();
		p1.attendMeeting();
		
		
	}
	
}
