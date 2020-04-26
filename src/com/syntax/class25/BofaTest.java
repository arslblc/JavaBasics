package com.syntax.class25;

public class BofaTest {
	public static void main(String[] args) {
		
		Bofa bank=new Bofa();
		bank.deposit();
		bank.trust();
		bank.financing();
		bank.withdraw();
		
		Bank b=new  Bofa();
		b.deposit();
		b.trust();
		b.withdraw();
		
		Trustable t=new Bofa();
		t.trust();
	}

}
