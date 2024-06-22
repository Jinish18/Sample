package com.adactin.pagefactor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass_Cuc;

public class LoginPageObjects extends Baseclass_Cuc{
	public LoginPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	public WebElement user;
	
	@FindBy(id="password")
	public WebElement pass;
	
	@FindBy(id="login")
	public WebElement login;


}
