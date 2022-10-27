package com.store.test.cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductLoginTest {

	@Test
	
	public static void loginTest() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45)); 
		
		driver.get("https://www.demoblaze.com/index.html");
		
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys("Abedin1");
		driver.findElement(By.id("loginpassword")).sendKeys("Maya112416");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		WebElement weccome = driver.findElement(By.xpath("//a[contains(text(),'Welcome Abedin1')]"));
		String actualText = weccome.getText();
		String expectedText = "Welcome Abedin1";
		
		Assert.assertEquals(actualText, expectedText,"Login failed");
	}
}
