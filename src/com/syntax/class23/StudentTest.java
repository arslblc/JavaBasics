package com.syntax.class23;


public class StudentTest {
	public static void main(String[] args) {
		
		Student student=new Student();
		student.study();
		student.doHomework();
		
		SyntaxStudent syntax=new SyntaxStudent();
		syntax.doHomework();
		syntax.getJob();
		syntax.study();
		syntax.accessParentOverridenMethod();
		
		
		Student st=new SyntaxStudent();//type casting
		st.study();
		st.doHomework();
		
	}

}
