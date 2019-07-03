package com.browsers;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.amazon.in");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\krishna\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe" );
		FirefoxDriver driver2=new FirefoxDriver();
		driver2.get("https://www.ebay.com");
		System.setProperty("webdriver.ie.driver","C:\\Users\\krishna\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		InternetExplorerDriver driver3=new InternetExplorerDriver();
		driver3.get("https://www.ebay.com");
		
		

	}

}

