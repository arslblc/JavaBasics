package com.syntax.selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
public static void main (String[]args) {
	System.setProperty("webdriver.chrome.driver", "//Users//lillygreen//Downloads//chromedriver");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com");
	
	driver.findElement(By.id("email")).sendKeys("yahoo.com");
	driver.findElement(By.id("pass")).sendKeys("yahoo.com");
	driver.findElement(By.id("u_0_b")).click();
	
	
	
}

}
