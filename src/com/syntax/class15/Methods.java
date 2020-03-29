package com.syntax.class15;

public class Methods {
	//methods without parameters
	void sayHello() {
		
for(int x=0; x<10; x++) {

	System.out.println("Hello World");
	}
	}
//create a method say any word #number of times

	//methods with parameters
void sayAnything(String word, int times) {
	
	for(int i=0; i<=times; i++ ) {
		System.out.println(word);
	}
}
//create a method isItRaining 
//that accept boolean value as a parameter 
//based on the value it will print message

void isItRaining(boolean isRain ) {
	if(isRain) {
		System.out.println("it is raining stay at home and learn Java");
	}else {
		System.out.println("not raining go for a walk");
	}
}
void isPalindrome(String name) {
	char[] array=name.toCharArray();
	String reverse="";
	for(int x=array.length-1; x>=0; x-- ) {
		reverse+=array[x];
	}
	if(reverse.equalsIgnoreCase(name)) {
System.out.println("is palindrome");
	}else {
		System.out.println("is NOT palindrome");
	}
}

void lang(String country) {
	switch(country.toLowerCase()) //matching case must be lower case 
	{
	case "russia":
	System.out.println("Privet");
	break;
	
	case "Tajikistan":
		System.out.println("Salom");
		break;
	case "Mexico" :
		System.out.println("Hola");
		break;
		default:
			System.out.println("wrong language");	
	}
}
	void isLarger(int a, int b) {
		if(a<b) {
			System.out.println(b+ " is the largest number");
		}else if (a>b) {
			System.out.println(a+ " is the largest number");
		} else {
			System.out.println("numbers are equal ");
		}
	}
	


	
	
	
	
}

