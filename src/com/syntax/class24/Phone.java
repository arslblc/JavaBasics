package com.syntax.class24;

public abstract class Phone {
	
	public void call() {
		System.out.println("Phone can make a call");
	}
	public void text() {
		System.out.println("Phone can seend a text");
	}
	
	public abstract void takePicture();
	public abstract void playMusic();
	

}
class Iphone extends Phone{
	
	public void takePicture() {
		System.out.println("Iphone takes pictures");
	}

	@Override
	public void playMusic() {
		System.out.println("Iphone play music");
		
	}
	
}

class Samsung extends Phone{

	@Override
	public void takePicture() {
		System.out.println("Samsung takes picture");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Samsung play music");
		
	}
	
	
}