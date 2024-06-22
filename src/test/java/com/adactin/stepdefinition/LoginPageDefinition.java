package com.adactin.stepdefinition;

import org.junit.Assert;

import com.adactin.pagefactor.BookHotelObjects;
import com.baseclass.Baseclass_Cuc;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinition {
	@Given("Launch the browser and load the Url")
	public void launch_the_browser_and_load_the_url() {
		 Baseclass_Cuc.browserLaunch();
		 Baseclass_Cuc.loadUrl("https://adactinhotelapp.com/");
		    }
	@When("Provide valid username and password hit login")
	public void provide_valid_username_and_password_hit_login() {
		BookHotelObjects lpo = new BookHotelObjects();
		lpo.user.sendKeys("Suwathikarthikeyan10");
		lpo.pass.sendKeys("Aiite2024");
		lpo.login.click();
	}

	@Then("Validate if the user logged in successfully.")
	public void validate_if_the_user_logged_in_successfully() {
		BookHotelObjects lpo = new BookHotelObjects();
		boolean displayed = lpo.Logo.isDisplayed();
		Assert.assertTrue(displayed);


}
}