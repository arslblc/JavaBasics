package com.syntax.class19;

public class Employee {
	 String name,lastName, startDate;
	  int employeeId,salary;
	  
	  public void display() {
		  System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	  }
	  
	  Employee(){
	 
	  }
	  Employee(String name,String lastName, int employeeId, String startDate,int salary){
	    this.name=name;
	    this.lastName=lastName;
	    this.employeeId=employeeId;
	    this.startDate=startDate;
	    this.salary=salary;
	  }
	  
	  public static void main(String[] args){
		   Employee obj=new Employee();
		   obj.display();
		   Employee obj1=new Employee("Joe ","Smith ", 12345, " 01/01/1970 ",35000);
		   obj1.display();
		    
		  }
		  
			

}
