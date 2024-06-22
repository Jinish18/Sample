package com.adactin.stepdefinition;

import org.junit.Assert;

import com.adactin.pagefactor.BookHotelObjects;
import com.baseclass.Baseclass_Cuc;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectHotelDefinition {

	@Given("Select location,hotel,room type,no of rooms.")
	public void select_location_hotel_room_type_no_of_rooms() {
		Baseclass_Cuc.dropDown(new BookHotelObjects().location,"Brisbane");
		Baseclass_Cuc.dropDown(new BookHotelObjects().hotels, "Hotel Hervey");
		Baseclass_Cuc.dropDown(new BookHotelObjects().room_type, "Deluxe");
		Baseclass_Cuc.dropDown(new BookHotelObjects().room_nos, "2 - Two");

}

	@When("Provide checkin date,checkout date,adult count and child count hit search")
	public void provide_checkin_date_checkout_date_adult_count_and_child_count_hit_search() {
		BookHotelObjects PO=new BookHotelObjects();
	    PO.datepick_in.sendKeys("27-06-2024");
	    PO.datepick_out.sendKeys("27-06-2024");
	    Baseclass_Cuc.dropDown(new BookHotelObjects().adult_room,"4 - Four");
	    Baseclass_Cuc.dropDown(new BookHotelObjects().child_room,"2 - Two");
	    PO.Submit.click();
	    
	}

	@Then("validate hotel available or not")
	public void validate_hotel_available_or_not() {
		BookHotelObjects lpo = new BookHotelObjects();
		boolean displayed = lpo.SelectRoom.isDisplayed();
		Assert.assertTrue(displayed);
    } 	


}
