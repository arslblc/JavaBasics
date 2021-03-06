package com.syntax.class28;

public abstract class Food {
	
	String foodType;
	String ingredient;
	int calories;
	
	public Food(String foodType, String ingredient, int calories) {
	  this.foodType=foodType;
	  this.ingredient=ingredient;
	  this.calories=calories;
	}
	
		public abstract void foodType();
		public abstract void ingredient();
		public abstract void calories();
		
}
class Soup extends Food{
	
	public Soup(String foodType, String ingredient, int calories) {
		super(foodType,ingredient,calories);
	}

	@Override
	public void foodType() {
		System.out.println(foodType+ "is a common appetizer in Turkey");
		
	}

	@Override
	public void ingredient() {
		System.out.println(foodType+ "has the main ingredient of "+ ingredient);
		
	}

	@Override
	public void calories() {
		System.out.println(foodType+ "has "+calories+" calories");
		
	}
	
}
class Salad extends Food{

	public Salad(String foodType, String ingredient, int calories) {
		super(foodType, ingredient, calories);
		
	}

	@Override
	public void foodType() {
		System.out.println(foodType+ "is a common salad in Turkey");
		
	}

	@Override
	public void ingredient() {
		System.out.println(foodType+ "has the main ingredient of "+ ingredient);
	}

	@Override
	public void calories() {
		System.out.println(foodType+ "has the low calories as"+calories);
		
	}
	
}

class Dessert extends Food{

	public Dessert(String foodType, String ingredient, int calories) {
		super(foodType, ingredient, calories);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void foodType() {
		System.out.println(foodType+ "has the main dessert in Turkey");
		
	}

	@Override
	public void ingredient() {
		System.out.println(foodType+ "has the main ingredient of "+ ingredient);
		
	}

	@Override
	public void calories() {
		System.out.println(foodType+ "has the high calories "+ calories);
		
	}
	
}
