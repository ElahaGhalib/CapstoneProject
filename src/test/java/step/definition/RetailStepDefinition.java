package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.Utils;


public class RetailStepDefinition extends Base {
	RetailPageObject retail = new RetailPageObject();
	
	@Given("User is on Retail website")
	public <retail> void user_is_on_Retail_website() {
	Assert.assertTrue(retail.isLogoPresent());
	Assert.assertEquals("TEK SCHOOL", retail.getTitle());
	logger.info("user is on Retail Website");
    Utils.takeScreenShot();
    Utils.hardWait();
	}
	
	@And("User click  on MyAccount")
	public void user_click_on_MyAccount() {
		retail.clickOnMyAccount();
		logger.info("user clicked on MyAccount option");
		
	}
	@When("User click on Login")
	public void user_click_on_login() {
		retail.clickOnLoginOption();
		logger.info("user clicked on Login Option");
		Utils.takeScreenShot();
	}
	@And("User enter username {string} and password {string}")
	public void user_enter_userName_and_password(String userName,String password) {
		retail.enterUserNameAndPassword(userName, password);
		logger.info("user entered " + userName + " and "+ password);
		Utils.takeScreenShot();
		Utils.hardWait();
	}
	@And("User click on Login button")
	public void user_click_on_login_button() {
		retail.clickOnLoginButton();
		logger.info("user clicked on Login Button");
	}
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_Myaccount_dashboard() {
		Assert.assertTrue(retail.successfulLogin());
		logger.info("user logged in to myAccount dashboard");
		Utils.takeScreenShot();
		Utils.hardWait();
		
	}
	
	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retail.clickOnRegisterForAnAffiliateAccountLink();
		logger.info("user clicked on Register for an Affiliate Account link");
		Utils.hardWait();

	}
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String,String>> affiliateInformation =dataTable.asMaps(String.class,String.class);
		retail.enterCompanyName(affiliateInformation.get(0).get("company"));
		retail.enterWebSite(affiliateInformation.get(0).get("website"));
		retail.taxIDField(affiliateInformation.get(0).get("taxID"));
		retail.selectpaymentMethod(affiliateInformation.get(0).get("paymentMethod"));
		retail.enterChequePayeeName(affiliateInformation.get(0).get("payeeName"));
		logger.info("user filled affiliate form");
		Utils.takeScreenShot();
		Utils.hardWait();
	}
	/*@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retail.clickonAboutUs();
		logger.info("user checked on About us check box");

	}*/
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retail.clickOnContinueButton();
		logger.info("user clicked on Continue button");
	   
	}
	@Then("User should see a success message")
	public <retail> void user_should_see_a_success_message() {
	   Assert.assertTrue(retail.isSuccessMessagePresent()); 
	   logger.info("success message is present");
	   Utils.takeScreenShot();
	   Utils.hardWait();
	}
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink(){
		retail.clickOnEditAffiliateInformation();
		logger.info("user clicked on edit affiliate information");
	}
	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retail.cliclOnBankTransferRadioBttn();
		logger.info("user clicked on Bank Transfer radio button ");
	}
	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		 List<Map<String,String>> bankInformation =dataTable.asMaps(String.class,String.class);
			retail.enterBankName(bankInformation.get(0).get("bankName"));
			retail.enterAbaNumber(bankInformation.get(0).get("abaNumber"));
			retail.enterSwiftCode(bankInformation.get(0).get("swiftCode"));
			retail.enteraccountName(bankInformation.get(0).get("accountName"));
			retail.enteraccountNumber(bankInformation.get(0).get("accountNumber"));
			logger.info("user filled bank information");
			Utils.takeScreenShot();
			Utils.hardWait();
		 
		 
	 }

@When("User click on {string} link")
public void user_click_on_link(String string) {
		retail.clickOnEditAccountInfo();
	   logger.info("user clicked on edit your account information"); 
	}

	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String,String>> editAccountInformation =dataTable.asMaps(String.class,String.class); 
	retail.enterFirstName(editAccountInformation.get(0).get("firstname"));
	retail.enterLastName(editAccountInformation.get(0).get("lastName"));
	retail.enterEmailAddress(editAccountInformation.get(0).get("email"));
	retail.entertelephone(editAccountInformation.get(0).get("telephone"));
	logger.info("user edited account information");
	
	Utils.takeScreenShot();
	Utils.hardWait();

	
}
}