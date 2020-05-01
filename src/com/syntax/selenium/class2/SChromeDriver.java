package com.syntax.selenium.class2;

public class SChromeDriver implements sWebDriver{
	
	public SChromeDriver() {
		System.err.println("Opening chrome browser");
	}

	@Override
	public void get(String url) {
		System.out.println("Launching the url:"+url);
		
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("Get current url");
		
		
	}

	@Override
	public void close() {
		System.out.println("closing the window");
		
	}

	@Override
	public void getTitle() {
		
		
	}
	

}
