package com.syntax.class09;

public class Array {
	
	public static void main (String[] args) {
		//program starts from index 0
		//the values in our array will be called as elements
		//array those value must be same type.
		//regular variable hold one value
		
		//two ways to declare variable
		
		int num1;
		num1=2; 
		
		//declare an array and initialize it.
		
		int[] array=new int [4];//# of values we stored in the array.
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		//access elements from an array.
		
		System.out.println(array[1]);
		
		//2 way
		
		String[] carArray;//preferred way 
		String carArray1[];
		
		carArray=new String[3]; 
		carArray[0]="BMW";
		carArray[1]="Ferrari";
		carArray[2]="Porsche";
		
		System.out.println("I am driving "+carArray[2]);
		
		int[] numbers=new int[3];
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=300;
		
		//change value of numbers[1]
		
		numbers[1]=2000;
		System.out.println(numbers[1]+numbers[2]);//2300
		
		
		
		
		
		
		
	}

}
