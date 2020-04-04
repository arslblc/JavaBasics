package com.syntax.class16;

class Main
{
	public static void main(String[] args) {
		int[] arr = {5,12,-3,7,3,22};
		System.out.println(maxValue(arr)); //should print 22
	}
	
	public static int maxValue(int[] arr) {
	  int index=0;
	  int largest=arr[0];
	  for(int x=1; x<arr.length; x++) {
	    
	    if(largest<arr[x]) {
	      index=x;
	      largest=arr[x];
	    }
	  
	}
	return arr[index];
	
	}
}