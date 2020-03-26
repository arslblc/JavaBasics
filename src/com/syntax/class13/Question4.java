package com.syntax.class13;

public class Question4 {
	public static void main (String[] args ) {
      //Find out how many alpha characters are present in a String? 
      //Find number of words in string?
		//alpha characters is letters
		String str="Hi9898jyhy%#@#%#!hbcsjd55hbc";
		str=str.replaceAll("[^A-Za-z]", "");
		System.out.println(str);
		int number=str.length();
		
System.out.println("number of alpha character "+ number);
		
		String str1="Today is Wednesday";
		String[] array=str1.split(" ");
		int words=array.length;
		System.out.println("number of words in array "+words);
		
		
	}

}
