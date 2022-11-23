package com.POM_RunnerClass;

import com.Base_class.Base_Class;
import com.POM_Class.HotelDetails;
import com.POM_Class.Hotel_Booking;
import com.POM_Class.Login;

public class POM_Runner extends Base_Class {
	public static void main(String[] args) throws InterruptedException {
		getDriver();
		getUrl("https://adactinhotelapp.com/");
	Login WebElement = new Login(driver);
		passvalue(WebElement.getUsername(),"SaiMathi");
		passvalue(WebElement.getPassword(), "In@9025654897123");
		click(WebElement.getclick());
	HotelDetails b = new HotelDetails(driver);
		SelectbyIndex(b.getLocation(), 3);
		SelectbyIndex(b.getLocation(), 5);
		SelectbyIndex(b.getHotels(), 3);
		SelectbyIndex(b.getRooms(), 3);
		SelectbyIndex(b.getNumberOfRooms(), 2);
		SelectbyIndex(b.getAdultRoom(), 2);
		SelectbyIndex(b.getChildRoom(), 1);
		click(b.getSubmit());
		click(b.getButton());
		click(b.getContinueClick());
	Hotel_Booking booking = new Hotel_Booking(driver);
		passvalue(booking.getFirstName(), "Indhu");
		passvalue(booking.getLastName(),"Mathi");
		passvalue(booking.getAddress(), "1/2 , ABC Street , Tenkasi");
		passvalue(booking.getCardNo(), "1234 5678 9012 3456");
		SelectbyIndex(booking.getCardType(), 3);
		SelectbyIndex(booking.getExpiryMonth(), 11);
		SelectbyIndex(booking.getExpiryYear(), 11);
		waitfewSec();
		passvalue(booking.getCvvnumber(), "98765");
		waitfewSec();
		click(booking.getBooking());
	}

}
