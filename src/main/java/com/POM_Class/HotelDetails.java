package com.POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelDetails {
	static WebDriver driver;
	//DropDown:
		@FindBy(xpath = "//select[@name='location']")
		private WebElement Location;
		
		public WebElement getLocation() {
			return Location;
		}
		
		
		@FindBy(xpath ="//select[@name='hotels']")
		private WebElement hotels;

		public WebElement getHotels() {
			return hotels;
		}
		
		@FindBy(xpath = "//select[@name='room_type']")
		private WebElement rooms;
		
		public WebElement getRooms() {
			return rooms;
		}
		
		@FindBy(xpath = "//select[@name='room_nos']")
		private WebElement numberOfRooms;
		
		public WebElement getNumberOfRooms() {
			return numberOfRooms;
		}
		@FindBy(xpath = "//input[@value='29/10/2022']")
		private WebElement inDate;
		
		public WebElement getInDate() {
			return inDate;
		}
		@FindBy(xpath = "//select[@name='adult_room']")
		private WebElement adultRoom;

		public WebElement getAdultRoom() {
			return adultRoom;
		}
		@FindBy(xpath = "//select[@name='child_room']")
		private WebElement childRoom;
		
		public WebElement getChildRoom() {
			return childRoom;
		}
		@FindBy(xpath = "//input[@id='Submit']")
		private WebElement submit;
		
		public WebElement getSubmit() {
			return submit;
		}
		@FindBy(xpath = "//input[@name='radiobutton_0']")
		private WebElement Button;
		
		public WebElement getButton() {
			return Button;
		}
		@FindBy(xpath = "//input[@name='continue']")
		private WebElement ContinueClick;
		
		public WebElement getContinueClick() {
			return ContinueClick;
		}
		public HotelDetails(WebDriver driver3) {
			this.driver=driver3;
			PageFactory.initElements(driver, this);
		}
		
		

	}


