package com.syntax.selenium.class2;

public class SFireFoxDriver implements sWebDriver{
	
	public SFireFoxDriver(){
		System.out.println("Opening firefox browser");
	}

	@Override
	public void get(String url) {
		System.out.println("Launching url: "+url);
		
	}

	@Override
	public void getCurrentUrl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}

}
