package com.syntax.class19;

public class ShoppingStore {
	 String item;
	  double price;
	  int quantity;

ShoppingStore(String item, double price, int quantity){
	   this.item=item;
	   this.price=price;
	   this.quantity=quantity;
	  }
	  public double itemTotalPrice(){
		    double total=quantity*price;
		
		    System.out.println(item+" Total Value "+ total);
			return total;
	  
	  }
		   
		   
		   
		  public static void main(String[] args){
			   
			   
			   
			   ShoppingStore obj=new ShoppingStore("Blanket",49.99,2);
			   ShoppingStore obj1=new ShoppingStore("Mattress ",219.59,2);
			   
			    double blanketTotalPrice = obj.itemTotalPrice(); 
			    double mattressTotalPrice = obj1.itemTotalPrice(); 
			    double sumPurchase = blanketTotalPrice + mattressTotalPrice; 
	     
			   
				System.out.println("You purchased "+sumPurchase+ " Today");
			  }
		}


	  
	  


