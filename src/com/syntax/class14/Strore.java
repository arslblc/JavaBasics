package com.syntax.class14;

public class Strore {

	public static void main(String[] args) {
		Phone iPhone=new Phone();
		iPhone.brand="Iphone";
		iPhone.color="White";
		iPhone.model="XR";
		iPhone.dial();
		iPhone.text();
		iPhone.pics();
		
		Phone Android=new Phone();
		Android.brand="Samsung";
		Android.color="Black";
		Android.model="Note10";
		Android.dial();
		Android.text();
		Android.pics();

		String str="Hello friends";
		str=str.replace("Hello", "Welcome");
		System.out.println(str);
	}

}
