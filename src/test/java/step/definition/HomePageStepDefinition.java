package step.definition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base {

	HomePageObject homepageobj = new HomePageObject();
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homepageobj.userClickOnCurrency();
		logger.info("user click on currency");
		Utils.takeScreenshotForStep();
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homepageobj.userChoseEuro();
		logger.info("user chose Euro from dropdown");
		Utils.takeScreenshotForStep();
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		List<WebElement> euroCurrency = homepageobj.Currency();
		for(WebElement element:euroCurrency) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title")+ " is present");
		}
		Utils.takeScreenShot();
		Utils.hardWait(); 
	}


	@Then("{string} message should display")
	public void message_should_display(String expectedshoppingCartMessage) {
		homepageobj.isShoppingCartMessageDisplayed();
		logger.info(expectedshoppingCartMessage + " equals to "+ homepageobj.shoppingCartMessage());
		Utils.takeScreenShot();
		Utils.hardWait();
	}

}
