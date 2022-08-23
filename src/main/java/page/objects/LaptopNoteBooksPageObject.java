package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;
import utilities.Utils;

public class LaptopNoteBooksPageObject extends Base{
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath= "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooksTab;
	
	@FindBy(xpath= "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;
	
	@FindBy(xpath= "//div[@class=\"product-thumb\"]")
	private WebElement Macbookitem;

	@FindBy(css= "div.alert")
	private WebElement MacbookSuccessMessage;
	
	@FindBy(css= "#product-category > div.alert.alert-success.alert-dismissible")
	private WebElement MacbookSuccessMessageCSS;
    
	@FindBy(id="cart-total")
    private WebElement itemAddedToTheCart;
	
    @FindBy(xpath="//span[text()='Shopping Cart']")
    private WebElement clickingOnShoppingCartOption;
    
    @FindBy(xpath= "//i[@class=\"fa fa-times-circle\"]")
	private WebElement removingMacbookFromCart ;
    
    @FindBy(xpath="//button[@class=\"btn btn-inverse btn-block btn-lg dropdown-toggle\"]")
    private WebElement zeroItemOnTheCart;
    
    @FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
    private WebElement macbookCamparisonIcon;
    
	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]")
    private WebElement macbookAirCamparisonIcon;
    //css="#content > div:nth-child(7) > div:nth-child(3) > div > div:nth-child(2) > div.button-group > button:nth-child(3)"
    @FindBy(css="#product-category > div.alert.alert-success.alert-dismissible > a:nth-child(3)")
    private WebElement productCamparisonLink;
    
    @FindBy(xpath="//strong[text()='Product Details']")
    private WebElement comparisonChart;
    
    @FindBy(xpath="//button[@onclick=\"wishlist.add('46');\"]")
    private WebElement clickingOnHeartIcanOfSonyVAIO;
    
    @FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
    private WebElement SuccessMessafgeForSonyVAIO;
    
    @FindBy(xpath=" //a[text()='MacBook Pro']")
    private WebElement clickingOnMacbookPro;
    
    @FindBy(xpath="//h2[text()='$2,000.00']")
    private WebElement doublePriceTagOfMacbook;
 
    
    
    
public void clickOnLaptopsAndNotebooksTab() {
	laptopsAndNotebooksTab.click();
	
}
public void clickOnshowAllLaptopsAndNotebooks() {
	showAllLaptopsAndNotebooks.click();
}
public void clickOnMacBook() {
	Macbookitem.click();
}
public boolean isSuccessMessagePresentForMacbook( ) {
	
	boolean isDisplayed = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(MacbookSuccessMessage)).isDisplayed();
	if(isDisplayed == true) {
	
	
		return true;
	}else {
		return false;
	}
	
	
	
}
public int successMessage() {
	
	return 0;
}
public void isItemPresentInTheCart() {
	itemAddedToTheCart.click();
}
public void userClickOnCart() {
	clickingOnShoppingCartOption.click();
}
public void userRemoveMacbookFromCart() {
	removingMacbookFromCart.click();
	
}
public boolean IsZeroItemInTheCartDisplayed() {
	if(zeroItemOnTheCart.isDisplayed()) {
	
		return true;
	}else
		return false;			
}
	



public void userClickOnMacBookCamparisonIcon() {
	macbookCamparisonIcon.click();
}
public void userClickOnMacBookAirCamparisonIcon() {
	macbookAirCamparisonIcon.click();
}
/*public boolean isSuccessMessagePresentForMacbookAir() {
	
	if(macbookAirSuccessMessage.isDisplayed()) {
	
		return true;
	}else {
		return false;	
	}


}*/
public void userClickONProductCamparisonLink() {
	productCamparisonLink.click();
}

public boolean isProductCamparisonChartPresent( ) {
	
	if(comparisonChart.isDisplayed()) {
	
		return true;
	}else {
		return false;	
	}
	
}
public void userClickOnHeartIcanSonyVAIO() {
	clickingOnHeartIcanOfSonyVAIO.click();
}

public boolean isSuccessMessagePresentForSonyVAIO() {
	
	if(SuccessMessafgeForSonyVAIO.isDisplayed()) {
	
		return true;
	}else {
		return false;	
	}


}
public void userClickOnMacbookProItem() {
	clickingOnMacbookPro.click();
}
public boolean isDoublePriceTagPresentOnUI() {
	
	if(doublePriceTagOfMacbook.isDisplayed()) {
	
		return true;
	}else {
		return false;	
	}


}
}	

