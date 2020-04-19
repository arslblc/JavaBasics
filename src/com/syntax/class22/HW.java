package com.syntax.class22;

public class HW {
	
	public int area(int a, int b) {
		int areaR=a*b;
		System.out.println("Area of your rectangular is "+areaR);
		return areaR;
	}
	
	public int area(int a) {
		int areaS=a*a;
		System.out.println("Area of your rectangular is "+areaS);
				return areaS;
				
	} 
	
	public int area(int a, int b, int c) {
		int areaB=a*b*c;
		return areaB;
	}
	
	public static void main(String[] args) {
		HW obj=new HW();
		int area=obj.area(10, 15);
		
		System.out.println(area);
		
		
		area=obj.area(40);
		System.out.println(area);
		
	}
	
	

}
