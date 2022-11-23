package com.Base_RunnerClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base_class.Base_Class;

public class Base_Runner extends Base_Class{

	public static void main(String[] args) throws IOException, InterruptedException {
		getDriver();
		getUrl("https://adactinhotelapp.com/");
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		passvalue(email, "SaiMathi");
//dropDown:		
		WebElement pwd = driver.findElement(By.xpath("//input[@type = 'password']"));
		passvalue(pwd, "In@9025654897123");
		
		WebElement click = driver.findElement(By.xpath("//input[@type = 'Submit']"));
		click.click();
		
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		SelectbyIndex(location, 2);
		
		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		SelectbyIndex(hotels, 1);
		
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		SelectbyIndex(room, 4);
		
		WebElement numberofRooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		SelectbyIndex(numberofRooms, 3);
		
//		WebElement indate = driver.findElement(By.xpath("//input[@value='29/10/2022']"));
//		clear(indate);
//		passvalue(indate, "03/11/2022");
//		
//		WebElement outDate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
//		clear(outDate);
//		passvalue(outDate, "5/11/2022");
		
		WebElement adultRoom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		SelectbyIndex(adultRoom,2);
		
		WebElement childrenRoom = driver.findElement(By.xpath("//select[@name='child_room']"));
		SelectbyIndex(childrenRoom, 1);
		
		WebElement submit = driver.findElement(By.xpath("//input[@id='Submit']"));
		click(submit);
		
		WebElement button = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		click(button);
		
		WebElement continueclick = driver.findElement(By.xpath("//input[@name='continue']"));
		click(continueclick);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		passvalue(firstname, "Indhumathi");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		passvalue(lastname, "somasundaram");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		passvalue(address, "1/2, abc street, Tenkasi");
		
		WebElement cardNo = driver.findElement(By.xpath("//input[@name='cc_num']"));
		passvalue(cardNo, "1234 5678 9012 3456");
		
		WebElement cardType = driver.findElement(By.xpath("//select[@name='cc_type']"));
		SelectbyIndex(cardType, 1);
		
		WebElement exp = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		SelectbyIndex(exp, 11);
		
		WebElement expyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		SelectbyIndex(expyear, 12);
		
		WebElement number = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		passvalue(number, "98765");
		
		WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		click(book);
		//Screenshot();
		
//		navigateTo("https://demoqa.com/alerts");
//		
//		WebElement simpleAlert = driver.findElement(By.xpath("//button[@id = 'alertButton']"));
//		click(simpleAlert);
//		waitfewSec();
//		acceptAlert(simpleAlert);
//		
//		singleFrame();
//		WebElement single = driver.findElement(By.xpath("//input[@type = 'text']"));
//		passvalue(single, "Indhumathi");
//		defaultContent();
//		
//		WebElement clickframe = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
//		click(clickframe);
//		
//		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']"));
//		driver.switchTo().frame(frame2);
//		
//		WebElement frame3 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
//		driver.switchTo().frame(frame3);
//		
//		WebElement frame4 = driver.findElement(By.xpath("//input[@type='text']"));
//		passvalue(frame4,"Welcome");
//		
//		navigateTo("https://www.google.com/");
//		WebElement actions = driver.findElement(By.xpath("//a[text() ='Images']"));
//		actions("click", actions);
//		
//		
//		WebElement action = driver.findElement(By.xpath("//a[@class='gb_A']"));
//		actions("ContainsClick", action);
//		
//		navigateTo("https://demoqa.com/droppable");
//		WebElement drag = driver.findElement(By.xpath("//div[@style ='position: relative;']"));
//		WebElement drop = driver.findElement(By.xpath("//div[@id = 'droppable']"));
//		actions("drag", drag);
//		actions("drop", drop);
//		waitfewSec();
//		
//		System.out.println("Succesfully");
//		
		
		
		
		
	}

}


