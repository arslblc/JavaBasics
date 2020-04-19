package com.syntax.class18;

public class Task1 {
	
	//Write a java program of Class Students that takes students name and 3 subject grades.
	//Inside your class also have a method to Calculate Average Grade.
	//Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
	String name;
	int grade1,grade2,grade3;
	private String average;
	
	Task1(String sName, int sgrade1, int sgrade2, int sgrade3){
name=sName;
grade1=sgrade1;
grade2=sgrade2;
grade3=sgrade3;
		
		
	}
	
	public int average() {
		int total=grade1+grade2+grade3;
		int ort=total/3;
		return average();
	}
	
	public static void main(String[] args) {
Task1 obj=new Task1("Ali", 80, 88, 90);
System.out.println("Student" +obj.name+ " average grade is "+obj.average);
Task1 obj1=new Task1("Arsel",95,97, 93);
System.out.println("Student" +obj1.name+ " average grade is "+obj1.average);
Task1 obj2=new Task1("Fatih",70,78,85);
System.out.println("Student" +obj2.name+ " average grade is "+obj2.average);
		
		
	}

}
