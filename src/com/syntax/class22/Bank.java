package com.syntax.class22;

public class Bank {
	
	double money,fee;
	
	Bank(double money){
	this.money=money;
	}
double chargeFee() { 
	if(money<1000) {
		fee=money*0.1;
	}else {
		fee=0;
	}
	return fee;
}
	
}
class BOFA extends Bank{
	
	BOFA(double money){
		super(money);
		
	}
	
}


class PNK extends Bank{
	PNK(double money){
		super(money);
	}

double chargeFee() {
	
	if(money<1000) {
		fee=money*0.2;
	} else {
		fee=0;
	}
	return fee;
}
}