package com.syntax.selenium.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	
	public static void main(String[]args) {

	System.setProperty("webdriver.chrome.driver", "//Users//lillygreen//Downloads//chromedriver");	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().fullscreen();
	driver.get("https://google.com");
	driver.navigate().refresh();
	
	driver.navigate().to("https://facebook.com");
	driver.navigate().to("https://amazon.com");
	driver.navigate().back();
	driver.navigate().forward();
}
}