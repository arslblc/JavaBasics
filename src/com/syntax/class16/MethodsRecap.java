package com.syntax.class16;

public class MethodsRecap {
	
	//create a method will accept array of integer and return max value from that array
	
	int getLargestNumber(int [] array) {
		
		int largest=array[0];
		
		for(int i=1; i<array.length; i++ ) {
			if (array[i]>largest) {
				largest=array[i];
			}
		}
		return largest;
	}
	
	//create a method that will accept a string and return  each word from a given string
	
	String[] getWords(String str ) {
		
	String[] array= str.split(" ");
	
	return array;
		
	}


public static void main (String[] args) {
	
MethodsRecap	obj=new MethodsRecap();
 int[] arr = {10,20,38,12};
 System.out.println(obj.getLargestNumber(arr));
 
 String str2=("It is a beautiful day");
String[] words=obj.getWords(str2);
//we use enhanced FOR LOOP
for(String kelimeler:words  ) {
	System.out.println(kelimeler);
}
 
}	
}
