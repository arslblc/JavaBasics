package com.syntax.class28;

public abstract class Flower {
	
public String type;


public Flower(String type) {
	this.type=type;
}

public abstract void bloom();

	
}


class Tulip extends Flower{

	public Tulip(String type) {
		super(type);
		
	}

	@Override
	public void bloom() {
		System.out.println(type+ " bloom is in March");
		
	}
	
}

class Rose extends Flower{

	public Rose(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bloom() {
		System.out.println(type+ " bloom is in May");
		
	}
	
}

class sunFlower extends Flower{

	public sunFlower(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bloom() {
		System.out.println(type+ " bloom is in August");
		
	}
	
}