package com.syntax.class11;

public class StringDemo {
	public static void main (String[] args) {
		
		String school="syntax  ";
		
        String str=new String("Hello");
        
        String str1="THIS is A string 76/76,>~";
        
        //how many characters we have inside our string
       System.out.println(school.length()); 
     int size=str1.length();
     System.out.println(size); 
     //convert string to lower case or uppercase
     
     System.out.println(school.toUpperCase());
     System.out.println(str1.toLowerCase());
     str=str.toUpperCase();
     System.out.println(str);
     //concatinate 2 string
   String newString=str+" "+ school;
   System.out.println(newString);
   
   System.out.println("=======STRING CONCAT========");
   String day="Saturday";
   String date="14";
   String newDate=day.concat(" "+date);//only works for strings.BOTHvalue be string. otherwise code will give you error
   System.out.println(newDate);
   
   System.out.println("=======isEmpty FUNCTION=======");
   
   String str3="dgdfgd";
   boolean empty=str3.isEmpty();
   System.out.println(empty);
     
   
   System.out.println("=========trim() FUNCTION====");//remove empty(white) spaces at the beginning and the end!
   
   String abc="    i love myself         ";
   System.out.print(abc.trim());
   
	}
	}
