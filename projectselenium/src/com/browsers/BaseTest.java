package com.browsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest {
	public static WebDriver driver;
	public static Properties p;
	public static FileInputStream fis;
	public static void init() throws Exception 
	{
		p=new Properties();
		fis=new FileInputStream(System.getProperty("user.dir")+"//data.properties");
		p.load(fis);
	}
	
	
	public static void launch(String browserkey)
	{
		if(p.getProperty(browserkey).equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			
			driver=new ChromeDriver();
			
		}else if(p.getProperty(browserkey).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
			
		}else if(p.getProperty(browserkey).equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
	}
		public static void navigate(String urlkey) {
			driver.get(p.getProperty(urlkey));
		
		
	}
	

}
