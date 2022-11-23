package com.POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Booking {

	static WebDriver driver;
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement FirstName;

	public WebElement getFirstName() {
		return FirstName;
	}
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}
	@FindBy(xpath = "//textarea[@name='address']") 
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement cardNo;

	public WebElement getCardNo() {
		return cardNo;
	} 
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement CardType;

	public WebElement getCardType() {
		return CardType;
	}
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expiryMonth;

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expiryYear;

	public WebElement getExpiryYear() {
		return expiryYear;
	}   
	@FindBy(xpath = "//input[@names ='cc_cvv']")
	private WebElement Cvvnumber;

	public WebElement getCvvnumber() {
		return Cvvnumber;
	}
	
	@FindBy(xpath ="//input[@name='book_now']" )
	private WebElement booking;

	public WebElement getBooking() {
		return booking;
	}
	
	public Hotel_Booking (WebDriver driver4) {
		this.driver=driver4;
		PageFactory.initElements(driver, this);
	}
}


