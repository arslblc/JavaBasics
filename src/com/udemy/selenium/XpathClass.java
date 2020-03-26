package com.udemy.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//lillygreen//Downloads//chromedrive");
		WebDriver driver=new ChromeDriver();
		
		driver.findElement(By.xpath("//*[@id=‘Login’]")).click();
		
		
		
		
	}
}
