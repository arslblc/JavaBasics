package com.syntax.class03;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		//widening happens implicitly
		double d=10;
		System.out.println(d);//10.0 we can convert int to double
		
		//int i=10.99;//-->cannot convert double to int
		
		//narrowing explicit implementing
		int i=(int)10.99;
		System.out.println(i); //you may lose some information
		
		//byte -128 to 127
		
		byte b=(byte)1284; // (byte) manuelly writed
		
		System.out.println(b);
		
		
	}

}
