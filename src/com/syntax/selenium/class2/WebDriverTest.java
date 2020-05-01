package com.syntax.selenium.class2;

public class WebDriverTest {

	public static void main(String[] args) {
		
		sWebDriver driver=new SChromeDriver();
		driver.get("https://google.com");
		driver.close();

		sWebDriver driver2=new SFireFoxDriver();
		driver2.get("https://google.com");
	}

}
