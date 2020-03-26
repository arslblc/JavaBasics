package com.udemy.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForces {
  
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//lillygreen//Downloads//chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.name("pw")).sendKeys("12345");
		driver.findElement(By.className("input r4 wide mb16 mt8 username")).click();//error bcs of compound classes cannot be accepted
		
}
}