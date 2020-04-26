package com.syntax.class26;

import java.util.ArrayList;

public class ArraylistIntro {

	public static void main(String[] args) {
		
	ArrayList<Integer> numbers=	new ArrayList<Integer>();
	numbers.add(10);
	numbers.add(10);
	numbers.add(40);
	numbers.add(10);
	
	System.out.println(numbers.contains(40));//true
	
for(int i=0; i<numbers.size(); i++) {
	int num=numbers.get(i);//unboxing
	System.out.println(num);
	
}
System.out.println("------------");

for(Integer num1:numbers) {
	System.out.println(num1);
}

	}

}
