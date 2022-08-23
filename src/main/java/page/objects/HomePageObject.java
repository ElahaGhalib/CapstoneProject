package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Currency']")
	private WebElement clickingOnCurrency;
	
	@FindBy(xpath="//button[text()='€ Euro']")
	private WebElement chooseEuro;
	

	@FindBy(xpath="//h1[text()='Shopping Cart']//following::p[text()='Your shopping cart is empty!']")
	private WebElement shoppingCartMessage;
	
	@FindBy(tagName="price")
	private List<WebElement>eurocurrency;
	
	
	
	public void userClickOnCurrency() {
		clickingOnCurrency.click();	
	}
	public void userChoseEuro() {
		chooseEuro.click();
	}
	
	public List<WebElement>Currency(){  
		List<WebElement>Currency=eurocurrency;
		return eurocurrency;
	}
	public String shoppingCartMessage() { 
		String actualResult = "Your shopping cart"+shoppingCartMessage.getText() + " is empty!" ; 
	return actualResult;
	
	}
	public boolean isShoppingCartMessageDisplayed() {
		
		if(shoppingCartMessage.isDisplayed()) {
		
			return true;
		}else {
			return false;	
		}
	}}

