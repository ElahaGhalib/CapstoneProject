package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	public WebElement testEnvironmentLogo;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountOption;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginOption;

	@FindBy(id = "input-email")
	private WebElement emailField;

	@FindBy(id = "input-password")
	private WebElement passWordField;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement loginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountDashboard;

	@FindBy(xpath = "//a[text()='Edit your affiliate information']")//a[text()='Register for an affiliate account']
	private WebElement registerForAnAffiliateAccount;

	@FindBy(id = "input-company")
	private WebElement companyField;

	@FindBy(id = "input-website")
	private WebElement webSiteField;

	@FindBy(id = "input-tax")
	private WebElement taxField;

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeButton;

	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement paypalButton;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankButton;

	@FindBy(id = "input-cheque")
	private WebElement chequePayeeNameField;

	@FindBy(xpath = "//input[@value='1']")
	private WebElement aboutUsCheckBox;

	@FindBy(xpath="//input[@class=\"btn btn-primary\"]")
	private WebElement continueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageOnAffiliatePage;
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateInformation;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement clickOnBankTransferRadioBttn;
	
	@FindBy(xpath="//input[@name='bank_name']")
	private WebElement bankNameField;
	
	@FindBy(id="input-bank-branch-number")
	private WebElement abaNumberField;
	
	@FindBy(id="input-bank-swift-code")
	private WebElement swiftCodeField;
	
	@FindBy(id="input-bank-account-name")
	private WebElement accountNameField;
	
	@FindBy(id="input-bank-account-number")
	private WebElement accountNumberField;
	
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement editAccountInformation;
	
	@FindBy(id="input-firstname")
	private WebElement firstnameField;
	
	@FindBy(id="input-lastname")
	private WebElement lastnameField;
	
	
	@FindBy(id="input-email")
	private WebElement EmailField;
	
	@FindBy(id="input-telephone")
	private WebElement telephoneField;
	
	
	public void clickOnMyAccount() {
		myAccountOption.click();
	}

	public void clickOnLoginOption() {
		loginOption.click();
	}

	public boolean isLogoPresent() {
		if (testEnvironmentLogo.isDisplayed())
			return true;
		else
			return false;
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void enterUserNameAndPassword(String userNameValue, String passValue) {
		emailField.clear();
		emailField.sendKeys(userNameValue);
		passWordField.clear();
		passWordField.sendKeys(passValue);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public boolean successfulLogin() {
		if (myAccountDashboard.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnRegisterForAnAffiliateAccountLink() {
		registerForAnAffiliateAccount.click();
	}

	public void enterCompanyName(String companyNameValue) {
		companyField.clear();
		companyField.sendKeys(companyNameValue);
	}

	public void enterWebSite(String webSiteValue) {
		webSiteField.clear();
		webSiteField.sendKeys(webSiteValue);
	}

	public void taxIDField(String taxIDValue) {
		taxField.clear();
		taxField.sendKeys(taxIDValue);
	}

	public void selectpaymentMethod(String paymentType) {
		if (paymentType.trim().equalsIgnoreCase("cheque")) {
			if (!chequeButton.isSelected()) {
				chequeButton.click();
			}
		} else if (paymentType.trim().equalsIgnoreCase("paypal")) {
			paypalButton.click();
		} else
			bankButton.click();
	}

	public void enterChequePayeeName(String chequePayeeNameValue) {
		chequePayeeNameField.clear();
		chequePayeeNameField.sendKeys(chequePayeeNameValue);
	}

	public void clickOnContinueButton() {
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(continueButton)).click();
		
		
		
	}

	public boolean isSuccessMessagePresent() {
		if(successMessageOnAffiliatePage.isDisplayed()) 
			return true;
			else 
			return false;
		
	}
	
	/*public void clickonAboutUs() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(aboutUsCheckBox)).click();
		//aboutUsCheckBox.click();
	}*/
public void clickOnEditAffiliateInformation() {
	editAffiliateInformation.click();
	
}
public void cliclOnBankTransferRadioBttn() {
	clickOnBankTransferRadioBttn.click();
}
public void enterBankName(String bankNameValue) {
	bankNameField.clear();
	bankNameField.sendKeys(bankNameValue);
}
public void enterAbaNumber(String abaNumberValue) {
	abaNumberField.clear();
	abaNumberField.sendKeys(abaNumberValue);
}
public void enterSwiftCode(String swiftCodeValue) {
swiftCodeField.sendKeys(swiftCodeValue);
}
public void enteraccountName(String accountNameValue) {
	accountNameField.sendKeys(accountNameValue);
}
public void enteraccountNumber(String accountNumberValue) {
	accountNumberField.sendKeys(accountNumberValue);
}
public void clickOnEditAccountInfo() {
	editAccountInformation.click();
}
public void enterFirstName(String firstNameValue) {
	firstnameField.clear();
	firstnameField.sendKeys(firstNameValue);
}
public void enterLastName(String lastNameValue) {
	lastnameField.clear();
	lastnameField.sendKeys(lastNameValue);
}
public void enterEmailAddress(String emailValue) {
	EmailField.clear();
	EmailField.sendKeys(emailValue);
}
public void entertelephone(String telephoneValue) {
	telephoneField.clear();
	telephoneField.sendKeys(telephoneValue);
}

}