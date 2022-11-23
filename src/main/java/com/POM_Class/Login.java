package com.POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	 static WebDriver driver;
//Email:	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement Username;

	public WebElement getUsername() {
		return Username;
	}

//Password:
	@FindBy(xpath = "//input[@type = 'password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	
//ClickLogin:
	@FindBy(xpath = "//input[@type = 'Submit']")
	private WebElement click;

	public WebElement getclick() {
		return click;
	}
//Constructor
	public Login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


}
