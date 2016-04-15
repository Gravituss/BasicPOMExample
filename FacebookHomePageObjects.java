package org.fb.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePageObjects {
	
	public FacebookHomePageObjects(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="email")
	public WebElement txtEmail;
	
	@FindBy(name="pass")
	public WebElement txtPass;
	
	@FindBy(name="firstname")
	public WebElement txtName;	
	
	@FindBy(name="lastname")
	public WebElement txtLastname;	

}
