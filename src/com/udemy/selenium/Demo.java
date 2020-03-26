package com.udemy.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;


public class Demo {
	
	public static void main(String[] args) {
	//	//TODO Auto-generated method stub
//selenium code-
		
	//create driver object	for chrome browser
		
	//We will strictly implement methods of webDriver
		
		/* Class name=X * X=Safari Driver
		
		x driver=new X(); */
		
	//invoke .exe file first	
	System.setProperty("webdriver.chrome.driver", "//Users//lillygreen//Downloads//chromedriver");	
	WebDriver driver=new ChromeDriver();//driver object class
	
	/*driver.get("http://facebook.com");
	driver.findElement(By.id("email")).sendKeys("This is my first code");
	driver.findElement(By.name("pass")).sendKeys("12345");
	driver.findElement(By.linkText("Forgot account?")).click();*/
	
	driver.get("http://login.salesforce.com");
	driver.findElement(By.id("username")).sendKeys("This is my second code");
	driver.findElement(By.xpath("//*[@id=‘Login’]")).click();
	
	}
	}
