package com.syntax.class19;

public class Dog {
	
	
	String dogName;
	  double dogWeight;
	  static String dogBreed="Mutt";
	  
	  public void display(){
	    System.out.println(dogName+" "+dogBreed+" "+dogWeight);
	  
	  }
	  
	  Dog(String name, double weight,String dogBreed){
		  
		  dogName=name;
		  dogWeight=weight;
		  dogBreed=dogBreed;
		  
}
	  Dog( double weight,String dogBreed ){
	  dogName=dogName;
	  dogBreed=dogBreed;
	  dogWeight=dogWeight;
}
	  public static void main(String[] args) {
		  Dog obj=new Dog("Tarzan",50, dogBreed);
		  obj.display();
		  Dog obj1=new Dog("Lucy", 10, dogBreed);
		  obj1.display();
		  

}
}
	  

