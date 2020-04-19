package com.syntax.class23;

public class WebDriver {
public void open() {
	System.out.println("opening browser");
	}
}

class FireFox extends WebDriver{
	
	public void open() {
	System.out.println("opening FireFox browser");
	}
}
class Chrome extends WebDriver{
	public void open() {
		System.out.println("opening Chrome browser");
	}
	
}
class InternetExplorer extends WebDriver{
	
	public void open() {
		System.out.println("opening Internet Explorer browser");
	}
	
}