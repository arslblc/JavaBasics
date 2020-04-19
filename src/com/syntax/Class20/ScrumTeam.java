package com.syntax.Class20;

public class ScrumTeam extends Employee {
	
	String ceremonies;
	
	void attendMeeting() {
		System.out.println("Scrum team attend "+ceremonies);
	}
}
class ProductOwner extends ScrumTeam{
	void prioritizeBacklog() {
		System.out.println("PO priorotize backlog");
	}
}
class ScrumMaster extends ScrumTeam{
	void navigateTeam(){
		System.out.println("Scrum Mater facilitates Scrum Team");
	}
}
class Developer extends ScrumTeam{
	void coding() {
		System.out.println("Developer writes code");
	}
}
class Tester extends ScrumTeam{
	void test() {
System.out.println("Testers ensure quality of coding");
}
}
class BusinessAnalyst extends ScrumTeam{
	void  analyst() {
		System.out.println("BA");
	}
}
