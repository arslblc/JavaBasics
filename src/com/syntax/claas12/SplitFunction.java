package com.syntax.claas12;

public class SplitFunction {
	public static void main (String[] args) {
		
		String motto="today is my favourite day";
	String[]  array=motto.split("my");
	
	System.out.println(array.length);
	
	System.out.println(array[0]);
	System.out.println(array[1]);
		
	String today1="Today is my favourite Java Class";
	String[] array2=today1.split("a");
	
	for(String arr: array2) {
		System.out.print(arr+" |");
	}
	
	
	//enhance for loop just works with array, so today1 is not array yet
	String today3="Today is my favourite Java Class";
	String[] words=today3.split(" ");
		
	for(int i=0; i<words.length; i++) {
		System.out.println(words[i]);
	}
		System.out.println("-----TRIM() FUNCTION----");
		
		String today4="Today is my favourite Java Class";
		today4=today4.trim();
		System.out.println("after trimming "+today4);
		
		//today4 and today4.split(" "); type mismatch split give you array of String
	}

}
