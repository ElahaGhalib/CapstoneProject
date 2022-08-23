package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.DesktopPageObject;
import utilities.Utils;


public class DesktopPageStepDefinition extends Base{
	
	DesktopPageObject desktoppage= new DesktopPageObject();
	
	// for 1st step given we have in RetailstepDefinition so we will not repeat it.
	//syntax @tag("exact word of step from scenario")
	//public void nameofthemethod(){}
	
	

	
	@When("User click on Desktops tab")
	public void User_click_on_Desktops_tab() {
		Utils.hardWait();
		desktoppage.clickonDesktopsTab();
		logger.info("user clicked on Desktops tab");
		Utils.takeScreenshotForStep();
	}
	@And("User click on Show all desktops")
	
	public void user_click_on_show_all_desktops() {
		Utils.hardWait();
		desktoppage.clickOnShowAllDesktops();
		logger.info("user clicked on show all desktops");
	}
	
	
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopsElements = desktoppage.desktopsItems();
		for(WebElement element:desktopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title")+ " is present");
		}
		Utils.takeScreenShot();
		Utils.hardWait();
	   
	}


/*
 * step 1 we need to store the element in a list
 * step 2 we need to iterate through the list
 * step 3 we need to write an assertion to validate each element (index) is present.
 */
@And("User click  ADD TO CART option on HP LP3065item")
public void user_click_add_to_cart_option_on_hp_lp3065item() {
	desktoppage.clickOnHPLP3065Item();
	logger.info("user clicked Add to cart option");
}
@When("User select quantity {int}")
public void user_select_quantity(Integer int1) {
	String strQuantity = int1.toString();
	desktoppage.selectQuantity(strQuantity);
}
/*@And("User select quantity {string}")
public void user_select_quantity(String string) {
	desktoppage.selectQuantity(string); 
	logger.info("user selected quantity" + string);
}*/
@And("User click add to Cart button")
public void user_click_add_to_cart_button() {
	desktoppage.clickOnAddToCartButton(); 
	logger.info("user clicked add to cart button");
}
@Then("User should see a message for HPLP {string}")
public void user_should_see_a_message_for_HPLP(String expectedSuccessMessage) {
	
	//Assert.assertTrue(desktoppage.isSuccessMessagePresentForHplp());
	desktoppage.isSuccessMessagePresentForHplp();
	logger.info(expectedSuccessMessage + " equals to "+desktoppage.successMessage() );
	Utils.takeScreenShot();
	Utils.hardWait();

}

@Then("User should see a message for Canon {string}")
public void user_should_see_a_message_for_Canon(String expectedSuccessMessage) {
	
	//Assert.assertTrue(desktoppage.isSuccessMessagePresentForCanon());
	desktoppage.isSuccessMessagePresentForCanon();
	logger.info(expectedSuccessMessage + " equals to "+desktoppage.successMessage() );
	Utils.takeScreenShot();
	Utils.hardWait();

}


@And("User click on Canon EOS 5D item")
public void User_click_on_canon_eos_5d_item() {
	desktoppage.clickOnCanonEOS5DCamera();	
}
@And("User click on write a review link")
public void User_click_on_write_a_review_link() {
	desktoppage.clickOnReviewLink();
}
@And("user fill the review information with below information")
public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	List<Map<String,String>> reviewInformation= dataTable.asMaps(String.class, String.class);
	desktoppage.enterYourName(reviewInformation.get(0).get("yourname"));
	desktoppage.enterYourReview(reviewInformation.get(0).get("yourReview"));
	desktoppage.selectRating(reviewInformation.get(0).get("Rating"));
	Utils.hardWait();
}
/*@When("User click on continue button")
public void User_click_on_continue_button() {
	desktoppage.clickingOnContinueButton();
	logger.info("user click on continue button");
}*/
@Then("User should see a message with {string}")
public void User_should_see_a_message_with(String expectedreviewSubmissionMessage) {

	 // Assert.assertTrue(desktoppage.reviewSubmissionMessage());
	
	 // logger.info(expectedreviewSubmissionMessage+ "equals to " +desktoppage.reviewSubmissionMessage());
	  Utils.takeScreenshotForStep();
	  Utils.hardWait();
}
@And( "User click  ADD TO CART option on Canon EOS 5Ditem")
	public void  User_click_ADD_TO_CART_option_on_Canon_EOS_5Ditem() {
	desktoppage.clickOnAddToCartButtonOnCanon();
}
@And ("User select color from dropdown Red")
 public void User_select_color_from_dropdown_Red() {
	desktoppage.selectColorFromDropDownRed("15");
}

@When("User click on Continue button Desktop")
public void user_click_on_continue_button() {
	desktoppage.clickOnContinueButton();
	logger.info("user clicked on Continue button");
   
}

}