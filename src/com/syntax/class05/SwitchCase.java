package com.syntax.class05;

public class SwitchCase {
	
	public static void main(String[] args) {

		int age;
		age=2;
		
		//switch is using for multiple if statement as a shortcut, it enables us to 
		//save time instead of writing so many different if's. instead of else if we use 
		//"default" 
		//after case use ":"
		//after systm.... "use break;"
		
		switch (age) {
		case 1:
			System.out.println("You are 1 years old");
			break;
		case 2:	
			System.out.println("You are 2 years old");
			break;
		case 3:
			System.out.println("You are 3 years old");
			break;
		case 4:
			System.out.println("You are 4 year old");
			break;
		default	:
			System.out.println("i do not know your age");
			break;
		}
		

}
}