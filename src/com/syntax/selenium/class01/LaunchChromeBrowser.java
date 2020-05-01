package com.syntax.selenium.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//lillygreen//Downloads//chromedriver");	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.arselbalci.com");
		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.arselbalci.com";
		if(actualUrl.equalsIgnoreCase(expectedUrl)) {
			String title=driver.getTitle();
		}else {
			System.out.println("wrong url is returned");
		}
		

	}

}
