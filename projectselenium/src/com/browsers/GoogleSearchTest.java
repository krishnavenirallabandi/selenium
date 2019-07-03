package com.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\krishna\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");
	}

}
