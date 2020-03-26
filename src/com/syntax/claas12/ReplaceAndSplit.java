package com.syntax.claas12;

public class ReplaceAndSplit {
	public static void main (String[] args) {

		String me="I' am a excellent tester";
		
		System.out.println("------replace() FUNCTION------");
		
		System.out.println(me.replace("a", "3"));
		
		System.out.println(me.replace("a","amazing"));
		//if it finds matching char sequence replace will happen
		//if it is not no action will be taken.
		//we can replace either single or sequence of characters
		
		String car="i have a Toyota";
		String car1=car.replace("Toyota", "Lexus");
		System.out.println(car1);
		
		System.out.println("-----replaceAll()---function");
		String str="Phone number is 1234567890";
		//get rid of all characters
	System.out.println(str);	
    str=str.replaceAll("[A-Z]", " ");//just P gone
    System.out.println(str);
  
       str= str.replaceAll("[a-z]"," ");
       System.out.println(str);
  
       System.out.println(str.replaceAll("[A-Za-z]", " "));
  
  
       String str1="Hello128274643****&&&**   !!89";
       str1=str1.replaceAll("[0-9]", " ");
       System.out.println(str1);
       
      str1= str1.replaceAll("[^A-Za-z]", " ");//Abc disindaki her seyi remove ediyor
       System.out.println(str1);
       
       
       String str2="Heloo1313^%$&887263863";
       str2=str2.replaceAll("[^A-Za-z0-9]", " ");
       System.out.println(str2);
       
       String str3="Hello students";
       str3=str3.replace(" ", "");
       System.out.println(str3);
       
       String subject="Java";
       subject=subject.replace("a", "e").replace("J", "i").toUpperCase();
       System.out.println(subject);
       
       subject=subject.replaceFirst("E", "g");
       System.out.println(subject);
	}

	
}
	

