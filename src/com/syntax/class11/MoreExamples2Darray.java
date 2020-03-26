package com.syntax.class11;

public class MoreExamples2Darray {

	public static void main(String[] args) {
		
		//lets create 2d array to store professions
		
		
		String[][]professions= {
				{"QA tester","developers","PO","Scrum Master"},
				{"Match Teacher","Science Teacher","ESL Teacher"},
				{"Dentist","Surgeon"},
		};
		
		//get elements using advance for loop
		
		for(String[] ocp:professions) {
     for(String meslek:ocp) {
	System.out.print(meslek+" ");
}
     System.out.println();
}
	}

}
