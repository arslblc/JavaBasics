package com.syntax.class04;

public class LoanSpecialistTask {
	
	public static void main(String[] args) {
		
		/*If loan is less than 200,000 then 
		 * you would lend the money otherwise 
		 * you would reject the client.
		 */
		
		double loan=250.00;
		
		if (loan<200.00) {
			System.out.println("Lend the money");
			
		}else {
			System.out.println("reject the client");
			
		}
	}

}
