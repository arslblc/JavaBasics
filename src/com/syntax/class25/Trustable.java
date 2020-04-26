package com.syntax.class25;

public interface Trustable {
	void trust();// by default CE add public abstract
	

}
interface Bank extends Trustable{
	
	void deposit();
	void withdraw();
	
}
class Bofa extends Finance implements Bank{

	@Override
	public void trust() {
		System.out.println("BOfa is trustable");		
	}

	@Override
	public void deposit() {
		System.out.println("You can deposit in BOfa ");	
		
	}

	@Override
	public void withdraw() {
		System.out.println("BOfa is trustable to withdraw money");	
	}
	
}

class PNK implements Bank, CreditUnion{

	@Override
	public void trust() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void giveCredit() {
		System.out.println("you can give credit ");	
		
	}
	
}

interface CreditUnion {
	void giveCredit();
}
class Finance{
	public void financing() {
		System.out.println("Finance depart deal with financing");	
	}
}







