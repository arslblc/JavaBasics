package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {
public static void main(String[]args) {
	
	Flower[] flowerArray = { new Tulip("Tulip"), new Rose("Rose"), new sunFlower("sunFlower") };
	
	ArrayList<Flower> flowers= new ArrayList<>();
	flowers.add(new Tulip ("Tulip"));
	flowers.add(new Rose ("Rose"));
	flowers.add(new sunFlower ("sunFlower"));
	
	for(Flower arraylist:flowers) {
		arraylist.bloom();
	}
	System.out.println("=====================");
	
	for(int i=0; i<flowers.size(); i++) {
		Flower str=flowers.get(i);
		str.bloom();
	}
	
	System.out.println("=====================");
	
	Iterator<Flower> it=flowers.iterator();
	while(it.hasNext()) {
		Flower str=it.next();
		str.bloom();
	}
	
	
}
}
