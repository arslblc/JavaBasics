package com.syntax.class17;

public class AccessingMembersOfClass {
	
	public static void main (String[] args) {
		
     Employee emp=new Employee();
     emp.name="Faysal";
     emp.lastName="Smm";
     emp.salary=10000;
     //emp.ssn=CE===>ssn is not visible, 
     
     Employee.method1();
     emp.method2();
     emp.method3();
   //CE; Method4 is not visible because it is private===>  emp.method4();//
	}
	
	

}
