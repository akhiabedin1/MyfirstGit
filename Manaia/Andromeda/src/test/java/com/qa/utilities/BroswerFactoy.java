package com.qa.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroswerFactoy {
	WebDriver driver; 
	
	public static WebDriver openApplication(WebDriver driver, String browser, String url) {
		
		if (browser.equalsIgnoreCase("chrome"))
		{
	
System.setProperty("webdriver.chrome.driver",
		"C:\\JavaAutomation - M\\Drivers\\Chrome Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		}
		
	}}



//"C:\PS_QA\geckodriver-v0.30.0-win64\geckodriver.exe"

	
	
