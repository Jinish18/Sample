package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass_Cuc {
	public static WebDriver driver;
	
public static void browserLaunch() {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
}
public static void loadUrl(String url) {
	driver.get(url);
}
public static void getattribute(WebElement element,String value) {
	String ID=element.getAttribute(value);
	System.out.println("Your Booking ID"+ID);
}

public static void dropDown(WebElement element, String value) {
	Select slc= new Select(element);
	slc.selectByVisibleText(value);
}

public static void click_value(WebElement element) {
	element.click();
}   

public static void close() {
	driver.close();
}

}
