package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
		
		String[][] cars= {
				{"Chevy","Ford","Lincoln"},
				{"BMW","Mercedes","Porsche"},
				{"Maserati","Ferrari","Fiat"},
		};
	
		
		for(int i=0; i<cars.length; i++) {
for(int x=0; x<cars[i].length; x++) {
System.out.print(cars[i][x]+" ");
	}

System.out.println();
}
		
		System.out.println("========advanced for loop====");
		//calculate how many cars been stored>?//simple way add int count; :))
		
		int count=0;
		for(String[] brand:cars) {
for(String araba:brand) {
System.out.print(araba+" ");
count++;

}
System.out.println();
		}
		System.out.println("Total="+count);
		

		
		
		}
	}