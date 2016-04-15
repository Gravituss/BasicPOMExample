package org.fb.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookFillingFormTest {
	
	public static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
		
		driver.navigate().to("https://facebook.com");
		
		FacebookHomePageObjects page = new FacebookHomePageObjects(driver);
		
		page.txtEmail.sendKeys("Selenium");
		page.txtPass.sendKeys("Selen546m");	
		
		page.txtName.sendKeys("Bob");
		page.txtLastname.sendKeys("Robins");
		

	}

}
