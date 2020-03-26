package com.syntax.class09;

public class MoreArrays {
	public static void main (String[] args) {
		
		String[] students=new String[4];// bu 3 olsa idi hata vercekti
		//altta 4 isim var cunku. we cannot increase the size of array. 
		
		students[0]="Arsel";
		students[1]="Ahmet";
		students[2]="G";
		students[3]="Aeron";
		
		System.out.println(students[3]);
		
		
		//this is gonna say "null" for [3];, because we did not initialize it.
		String[] inClassStudents=new String[4];
		inClassStudents[0]="Hatca";
		inClassStudents[1]="Aysa";
		inClassStudents[2]="Ma";
		
		System.out.println(inClassStudents[3]);
		
		//it will create problem because we forgot 0 in the beginning
		
		String[] inClassStudents1=new String[3];
		inClassStudents1[0]="Hatca";
		inClassStudents1[1]="Aysa";
		inClassStudents1[2]="Ma";
		
		System.out.println(inClassStudents1[2]);
		
		
		
		
		
	}

}
