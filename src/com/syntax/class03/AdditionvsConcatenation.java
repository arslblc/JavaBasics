package com.syntax.class03;

public class AdditionvsConcatenation {
	
	public static void main (String[] args) {
		
		
		int a=10;
		int b=20;
		
		String x="Hello";
		String y="Bye";
		
		//ctrl+space-->autocomplete
		System.out.println(a+b+x+y);//they start with int so + considered as concacetation 
		System.out.println(a+x+b+y);
		System.out.println(x+y+a+b); // as soon as first time is a string rest will be considered as string
		//even if they are int
		System.out.println(x+y+(a+b));
		System.out.println(a+" "+b+x+y);
		System.out.println(a+""+b+x+y);
		
		
	}

}
