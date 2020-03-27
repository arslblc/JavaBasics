package com.syntax.class13;

public class Question5 {

	public static void main(String[] args) {
		// Write a java program to reverse String? Reverse a string word by word?

		String str="I love Java";
		String reverse="";
		
		for(int i=str.length()-1; i>=0; i--) {
       
	reverse=reverse+str.charAt(i);}
		
	System.out.println(reverse);

	String[]array=str.split(" ");
	String reverse1="";
	
	for(int x=array.length-1; x>=0; x--) {
     
     reverse1=reverse1+array[x]+" ";
		
	}
	System.out.println("reverse string words "+reverse1);

}
	}
