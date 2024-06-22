package com.adactin.stepdefinition;

import org.junit.Assert;

import com.adactin.pagefactor.BookHotelObjects;
import com.baseclass.Baseclass_Cuc;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookHotelDefinition {
	@Given("Enter firstName,LastName,Billing Address,credit card No.")
	public void enter_first_name_last_name_billing_address_credit_card_no() {
	BookHotelObjects PO= new BookHotelObjects ();
	PO.first_name.sendKeys("Suwathi");
	PO.last_name.sendKeys("Karthikeyan");
	PO.address.sendKeys("Madipakkam");
	PO.cc_num.sendKeys("1234567898765321");
}

	@When("Select card Type,Expire date and CVV Number")
	public void select_card_type_expire_date_and_cvv_number() {
	Baseclass_Cuc.dropDown(new BookHotelObjects().cc_type, "Master Card");		
    Baseclass_Cuc.dropDown(new BookHotelObjects().cc_exp_month, "April");
    Baseclass_Cuc.dropDown(new BookHotelObjects().cc_exp_year, "2029");
    BookHotelObjects PO=new BookHotelObjects();
    PO.cc_cvv.sendKeys("1234");
    PO.book_now.click();
 }

	@Then("Validate the order ID.")
	public void validate_the_order_id() throws InterruptedException {
		Thread.sleep(10000);
		BookHotelObjects lpo = new BookHotelObjects();
		boolean displayed = lpo.OrderID.isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println("OrderID");
		Baseclass_Cuc.close();
}


}
