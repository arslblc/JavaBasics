package com.syntax.class17;

public class Examples {
	
	//Create a method that will accept an array as parameters and will return a sum of all elements from that array.
	//Method should be visibly only within same package and accessible by the creating an instance of the class.

	//TASK1
	protected int sumFromArray(int[] array ) {
		
		int total=0;
		for(int x=0; x<array.length; x++) {
			total = total + array[x];
		}
		return total;
	}
		//TASKk2
		public static String get(String str) {
			
			String reverse = "";
		
			for(int x=str.length()-1; x>=0; x--) {
				
				reverse= reverse+str.charAt(x);
			}
			return reverse;
		
		}
	private static String getVowels(String str) {
		String vowels;
		vowels=str.replaceAll("[^aeiouAEIOU]","");
		return vowels;
	}
	
	
	public static void main(String[] args) {
		
		Examples obj=new Examples();
		int[] a= {5,7,18,54};
		System.out.println(obj.sumFromArray(a));

		System.out.println(get("Good"));
		
		String vowels=getVowels("Hello");
		System.out.println(vowels);
	}


	
	
	
	//Create a method that will take a String as a parameter and returns reverse String.
	//Method should be available to all classes within your projects and accessible by class name.
	
	
	
	
	//Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
	//Method should be available inside the class where it was declared and executed by calling it is name.
	
}
