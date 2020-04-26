package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListRecap {
	
public static void main(String[] args) {
	//let's create double type of objects
	
//1-generic collection arraylist	
ArrayList<Double> alist=new ArrayList<Double>();

alist.add(10.99);
alist.add(270.99);	
alist.add(11.99);
alist.add(450.99);

//replace elements
alist.set(2, 25.0);

//remove elements
alist.remove(3);


System.out.println(alist.size());

//retrieve single element
System.out.println(alist.get(1));

//1.enhanced for loop to retrieve all elements from collection for loop
for(double a:alist) {
	System.out.println(a);
	
}	
	System.out.println("================");
	
//2. regular loop
	for(int x=0; x<alist.size(); x++) {
		double d=alist.get(x);
		System.out.println(d);
	}	
	
	System.out.println("================ITERATOR IS ON DUTY=============");
//3. way-itirator
	Iterator<Double> iterator=alist.iterator();//import from java util 
	while(iterator.hasNext()){
		double a=iterator.next();
		System.out.println(a);
	}	



System.out.println("===============Non generic collection=====");

//non generic collection arraylist

ArrayList obj=new ArrayList();
obj.add(15);
obj.add("envy");
obj.add('a');
obj.addAll(alist);

for(Object o:obj) {
	System.out.print(o+",");
}
System.out.println(" ");
System.out.println(obj);







}
	

}
