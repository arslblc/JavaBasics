package com.syntax.class29;

public abstract class InsuranceHW {

   String InsuranceName;
   
   InsuranceHW(String InsuranceName){
	   this.InsuranceName=InsuranceName;
   }
public abstract void getQuote();

public abstract void cancelInsurance();
}
class Car extends InsuranceHW{
	
    String carModel;
	
	Car(String InsuranceName,String carModel) {
		super(InsuranceName);
		this.carModel=carModel;
	}

	@Override
	public void getQuote() {
		System.out.println("16000$ offered from "+InsuranceName+" for "+carModel);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("16000$ offered from "+InsuranceName+" for "+carModel);
		
	}
	
}