package com.syntax.class23;

public class Student {

	public void study() {
		System.out.println("Student Studies");
		
	}
	
	public void doHomework() {
		System.out.println("Student do homeworks");
	}
}	
	class SyntaxStudent extends Student{
		
		@Override
		public void study() {
			System.out.println("Syntax stdents are coding");
		}
		public void getJob() {
			System.out.println("Syntax stdents become QA automation engineer");
		}
		public void accessParentOverridenMethod() {
			super.study();
		}
		
	}

