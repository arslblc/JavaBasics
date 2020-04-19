package com.syntax.class19;

public class USA {
	String state,stateCapital;
	
	public USA (String state, String stateCapital) {
this.state=state;
this.stateCapital=stateCapital;
}
	
	public void displayState() {
System.out.println(state);
	}
	public void displayCapital() {
		System.out.println(stateCapital);
			}
			
	//can i call 1 method inside another method?----->YES
	public void displayInfo() {
		
		displayState();//by default compiler implicitly add this keyword to a method
		displayCapital();
	}
	
	public static void main(String[] args) {
USA obj=new USA("Austin","Texas");
obj.displayInfo();

}
	}
