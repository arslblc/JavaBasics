package com.syntax.class18_1;

import com.syntax.class18.Task2;

public class TestDifferentPackageforConstructor {
	Task2 obj=new Task2();//oONLY public constructor visible in different package
	
	//CE---Task2 obj1=new Task2(14);
	//CE--Task2 obj2=new Task2(15,16);
	//CE--Task2 obj3=new Task2("Hello");


}
