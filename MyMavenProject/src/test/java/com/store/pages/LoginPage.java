package com.store.pages;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.testng.Assert;
	
	
	public class LoginPage {
		WebDriver driver;
	
		public LoginPage (WebDriver Idriver) {
			this.driver = Idriver;
	 
		}
		
		@FindBy(xpath = "//a[text()='Log in']") WebElement login;
		@FindBy(id = "loginusername") WebElement uName; 
		@FindBy(id = "loginpassword") WebElement uPass; 
		@FindBy(xpath = "//button[text()='Log in']") WebElement loginBtn; 
		@FindBy(xpath = "//a[text() ='Welcome Abedin1']") WebElement welcome;
		
		
		public void loginToStore(String name, String pass) {
			if(login.isDisplayed() && login.isEnabled());
			login.click();
			
			if(login.isDisplayed() && uName.isEnabled());
			uName.sendKeys(name);
			
			if(login.isDisplayed() && uPass.isEnabled());
			uPass.sendKeys(pass);
			
			if(login.isDisplayed() && loginBtn.isEnabled());
			loginBtn.click();
		}
		public void validateLandingPage() {
		String actualText = welcome.getText();
		String expectedText = "Welcome Abedin1";
		Assert.assertEquals(actualText,expectedText,expectedText);
			
		}
		
	}
