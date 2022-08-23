package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base {
	
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
		
	}
//Syntax for storing UI Element in POM class using PageFactory implementation
	//@FindBy(locatorType ="Locator")
	//AccessModifier WebElement NameOfElement
	
	@FindBy(xpath= "//a[text()='Desktops']")
	private WebElement desktops;
	
	@FindBy(xpath="//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(tagName="img")//in here we evaluate 12 images on retail page and if we change the private to public we don't need method 1
	private List<WebElement> items;
	
	@FindBy(xpath="//a[text()='HP LP3065']")
	private WebElement hpLP3065;
	
	@FindBy(id="input-quantity")
	private WebElement quantityInput;
	
	@FindBy(id="button-cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")//in here i did inspect from whole success message just HP LP3065 //a[text()='HP LP3065'])[3]
	private WebElement HPLPsuccessmessage;
	
	@FindBy(xpath="//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DCamera;
	
	@FindBy(xpath="//a[text()='Write a review']")
	private WebElement writeReviewLink;
	
	@FindBy(id="input-name")
	private WebElement yourNameField;
	
	@FindBy(id="input-review")
	private WebElement yourReviewField;
	
	@FindBy(xpath="//input[@type='radio']")
	private List<WebElement>rating;
	
	//@FindBy(xpath="//button[@class=\"btn btn-primary\"]")//button[text()='Continue']
	//private WebElement ContinueButton;
	
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")  //id=\"form-review\\\"]/div[2]/text()
	private WebElement reviewSubmissionMessage;
	//private String for above
	@FindBy(xpath="//a[text()='Canon EOS 5D Camera']")
	private WebElement AddToCartButtonOnCanon;
	

	@FindBy(id="input-option226")
	private WebElement selectColor;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement CanonSuccessMessage;
	
	
	
	
	
	public void clickonDesktopsTab() {
		Utils.hoveMouseOverElement(desktops);
		
	}
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
		
	}
	public List<WebElement>desktopsItems(){  //1
		List<WebElement>itemsDesk=items;
		return items;
	}
	public void clickOnHPLP3065Item() {
		hpLP3065.click();
	}
	public void selectQuantity(String quantityValue) {
		quantityInput.clear();
		quantityInput.sendKeys(quantityValue);
	}
public void clickOnAddToCartButton() {
	addToCartButton.click();
}
public String successMessage() { // * option
	String actualResult = "Success: You have added"+HPLPsuccessmessage.getText() + "to your shopping cart!" ; //in here i paste the copied success message
return actualResult;

}
public String isCanonSuccessMessagePresent() { 
	String actualResult = "Success: You have added"+CanonSuccessMessage.getText() + "to your shopping cart!" ; 
return actualResult;
}

	

// i can use boolean instead of * option it is easiest way
public boolean isSuccessMessagePresentForHplp( ) {
	
	if(HPLPsuccessmessage.isDisplayed()) {
	
		return true;
	}else {
		return false;	
	}
	
		
	
}
public boolean isSuccessMessagePresentForCanon( ) {
	
	if(CanonSuccessMessage.isDisplayed()) {
	
		return true;
	}else {
		return false;	
	}
	
		

}


public void clickOnCanonEOS5DCamera() {
 	canonEOS5DCamera.click();
}
public void clickOnReviewLink() {
	writeReviewLink.click();
}
public void enterYourNameValue(String yourname) {
	yourNameField.clear();
	yourNameField.sendKeys(yourname);
}
public void enterYourRiview(String yourReview) {
	yourReviewField.clear();
	yourReviewField.sendKeys(yourReview);
}
public void selectRating(String ratingValue) {
	List<WebElement>ratingElements =rating;
	for(WebElement element: ratingElements) {
		if (element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
			element.click();
			break;
		}
	}
}
/*public void clickingOnContinueButton() {
	ContinueButton.click();
}*/
public void enterYourName(String nameValue) {
	yourNameField.clear();
	yourNameField.sendKeys(nameValue);
}
public void enterYourReview(String reviewValue) {
	yourReviewField.clear();
	yourReviewField.sendKeys(reviewValue);	
}

public boolean reviewSubmissionMessage() {
	if(reviewSubmissionMessage.isDisplayed())
		return true;
	else 
		return false;
}
public void clickOnAddToCartButtonOnCanon() {
	AddToCartButtonOnCanon.click();	
}


public void selectColorFromDropDownRed(String color) {
	Select select = new Select(selectColor);
	select.selectByValue(color);
	
	

}

public void clickOnContinueButton() {
	
	driver.findElement(By.id("button-review")).click();	
	
}
}

