package com.Base_class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	//BrowserLaunch:
		public static void getDriver() {
			 System.setProperty("webdriver.chrome.driver",
				  "D:\\java-2022-062\\eclipse\\Adactin_MavenProject\\driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		}
		public static void getUrl(String Url) {
			driver.get(Url);
		}
		public static void passvalue(WebElement element , String value ) {
			element.sendKeys(value);
		}
		public static void click(WebElement element) {
			element.click();
		}
		
	//DropDown:
		public static void SelectbyIndex(WebElement select, int value) {
			Select s = new Select(select);
			s.selectByIndex(value);
		}
		public static void clear(WebElement clear) {
			clear.clear();
		}
	//TakeScreenshot:
		public static void Screenshot() throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File from = ts.getScreenshotAs(OutputType.FILE);
			File to = new File("D:\\java-2022-062\\eclipse\\Project\\ScreenShot2\\indhu.png");
			FileHandler.copy(from, to);
		}
	//WebDriverMethods:
		public static void geTitle() {
			driver.getTitle();
		}
		public static void getCurrentTitle() {
			driver.getCurrentUrl();
		}
	//navigationMethod:
		public static void navigateTo(String url) {
			driver.navigate().to(url);
		}
		public static void navigateForward() {
			driver.navigate().forward();
		}
	//Alert:
		//Simple alert:
		public static void acceptAlert(WebElement ele ) {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		//confirm alert:
		public static void DismissAlert(WebElement ele) {
			Alert alert =driver.switchTo().alert();
			alert.dismiss();
			
		}
		//promptAlert:
		public static void typesomrthing(WebElement element , String value) {
			
			 driver.switchTo().alert().sendKeys(value);;
			
		}
		public static void waitfewSec() throws InterruptedException {
			Thread.sleep(3000);
		}
			
	//Frame:
		//SingleFrame:
		public static void singleFrame() {
			navigateTo("https://demo.automationtesting.in/Frames.html");
			driver.switchTo().frame(0);
			
		}
		public static void defaultContent() {
			driver.switchTo().defaultContent();
		}
	//Action:
	  public static void actions(String actionName, WebElement element) {
		 Actions a = new Actions(driver);
		 if (actionName.equalsIgnoreCase("ClickOn")) {
			a.click(element).build().perform();
		 }
		else if (actionName.equalsIgnoreCase("ContainsClick")) {
			a.contextClick(element).build().perform();
		}
		else if (actionName.equalsIgnoreCase("Drag")) {
			a.moveToElement(element).build().perform();
		}
		else if (actionName.equalsIgnoreCase("Drop")) {
			a.moveToElement(element).build().perform();
			
		}
			
		}
			
		
			
		
	  }
	//Roborts:
		
		
	


