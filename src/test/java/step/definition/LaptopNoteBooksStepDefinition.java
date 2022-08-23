package step.definition;



import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;


public class LaptopNoteBooksStepDefinition extends Base {
	
	LaptopNoteBooksPageObject laptopsAndNotebookstab= new LaptopNoteBooksPageObject();

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopsAndNotebookstab.clickOnLaptopsAndNotebooksTab();
		logger.info("user click on laptops and notebook tab");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopsAndNotebookstab.clickOnshowAllLaptopsAndNotebooks();
		logger.info("User click on Show all Laptop &NoteBook option ");
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopsAndNotebookstab.clickOnMacBook();
		logger.info("User click on MacBook  item");
		Utils.takeScreenShot();
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		laptopsAndNotebookstab.isSuccessMessagePresentForMacbook();
			logger.info("user can see a success message for macbook");
			Utils.takeScreenShot();
			Utils.hardWait();

	}

	@Then("User should see {int} tem\\(s){int}.00showed to the cart")
	public void user_should_see_tem_s_00showed_to_the_cart(Integer int1, Integer int2) {
		laptopsAndNotebookstab.isItemPresentInTheCart();
		logger.info("user should see the item in the cart");
		Utils.takeScreenShot();
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopsAndNotebookstab.userClickOnCart();
		logger.info("user hover mouse on macbook item in the cart");
		Utils.takeScreenShot();
	}

	@Then("user click on red X button to remove the item from cartThen item should be removed and cart should show {int} item\\(s)")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart_then_item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		laptopsAndNotebookstab.userRemoveMacbookFromCart();
		laptopsAndNotebookstab.IsZeroItemInTheCartDisplayed();
		logger.info("user remove macbook from the cart");
		Utils.takeScreenShot();
	}

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopsAndNotebookstab.userClickOnMacBookCamparisonIcon();
		logger.info("user click on macbook camparison icon");
		Utils.takeScreenShot();
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopsAndNotebookstab.userClickOnMacBookAirCamparisonIcon();
		logger.info("user click on macbookAir camparison icon");
		Utils.takeScreenShot();
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopsAndNotebookstab.userClickONProductCamparisonLink();
		logger.info("user click on product camparison link");
		Utils.takeScreenShot();
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptopsAndNotebookstab.isProductCamparisonChartPresent();
		Utils.takeScreenShot();
	}

	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptopsAndNotebookstab.userClickOnHeartIcanSonyVAIO();
		logger.info("user click on heart ican of Sony VAIO");
		Utils.takeScreenShot();
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String expectedSuccessMessage) {
		laptopsAndNotebookstab.isSuccessMessagePresentForSonyVAIO();
		logger.info(expectedSuccessMessage + " equals to "+laptopsAndNotebookstab.successMessage() );
		Utils.takeScreenShot();
		Utils.hardWait();

	   
	}

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptopsAndNotebookstab.userClickOnMacbookProItem();
		logger.info("user click on macbook pro item");
		Utils.takeScreenShot();
		Utils.hardWait();
	}

	@Then("User should see  ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		laptopsAndNotebookstab.isDoublePriceTagPresentOnUI();
			
	    
	}

}
