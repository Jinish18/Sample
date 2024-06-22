package com.adactin.pagefactor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotelObjects extends SelectHotelObjects {
	@FindBy(xpath="//td[@class='login_title']")
    public WebElement SelectRoom;
	
	@FindBy(id = "radiobutton_0")
	public WebElement radiobutton_0;
    
    @FindBy(id = "continue")
    public WebElement continue1;
}



