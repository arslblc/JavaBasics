package com.syntax.class22;

public class BankTest {
	public static void main(String[] args) {
		Bank obj=new Bank(700);
		double fee=obj.chargeFee();
		System.out.println(fee);
		
		BOFA bofa=new BOFA(700);
		fee=bofa.chargeFee();
		System.out.println(fee);
		
		PNK pnk=new PNK(700);
		fee=pnk.chargeFee();
		System.out.println(fee);
	}

}
