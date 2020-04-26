package com.syntax.class26;

public class WrapperClasses {

	public static void main(String[] args) {
		
		Integer num=10;//presented of the integer type
		num.toString();//convert my variable to string
		System.out.println(num.MIN_VALUE);
		
		Byte b=90;
		System.out.println(b.MIN_VALUE);
		System.out.println(b.MAX_VALUE);
		String s1=b.toString();
		System.out.println(s1);
		
		Boolean boo=true;
		boolean b1=boo;//auto-unboxing
		
		
	}

}
