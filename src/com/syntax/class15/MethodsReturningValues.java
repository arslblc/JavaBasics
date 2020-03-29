package com.syntax.class15;

public class MethodsReturningValues {

	public static void main(String[] args) {
		// create a string based on the length of String
		//we will define whether string is short or long
		
		String str="Hello my friend";
        int length=str.length();
        
        if(length>10) {
        	System.out.println("Long");
        }else {
        	System.out.println("Short");
        }
        
        //compare 2 numbers and the
        //we will identify whether largest number is even or odd
        
        Methods obj1=new Methods();
        obj1.isLarger(25, 40);
        
        MethodsReturningValues obj2=new MethodsReturningValues();
        int num=obj2.largest(100, 15);
        System.out.println(num);
        
	}
	
	//create a method returns largest number from given numbers
	
	int largest(int a, int b) {
		int largest;
		if(a>b) {
			largest=a;
		}else {
			largest=b;
			
		}
		return largest;
	}

}
