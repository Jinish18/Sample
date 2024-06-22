package com.adactin.stepdefinition;

import org.junit.Assert;

import com.adactin.pagefactor.BookHotelObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHotelDefinition {
	@Given("Select radio button")
	public void select_radio_button() {
		BookHotelObjects PO =new BookHotelObjects();
	    PO.radiobutton_0.click();
	}

	@When("select continue")
	public void select_continue() {
		BookHotelObjects PO =new BookHotelObjects();
	    PO.continue1.click();
	}

	@Then("validate Hotel selected")
	public void validate_hotel_selected() {
		BookHotelObjects PO =new BookHotelObjects();
	    boolean displayed = PO.BooKRoom.isDisplayed();
	    Assert.assertTrue(displayed);
	}


}
