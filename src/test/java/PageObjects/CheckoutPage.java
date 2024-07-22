package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.GernericUtils;
import Utils.TextContextSetup;

public class CheckoutPage {
	
	
	
	@FindBy(xpath="//input[@type='search']") private WebElement searchProduct;
	@FindBy(xpath="//a[@class='increment']") private WebElement increaseItem;
	@FindBy(xpath="//div[@class='product']//h4") private WebElement homePageProductName;
	@FindBy(xpath="//div[@class='product-action']/button") private WebElement AddToCartBtn;
	@FindBy(xpath="//img[@alt='Cart']") private WebElement CartIcon;
	@FindBy(xpath="//button[contains(text(),'PROCEED TO CHECKOUT')]") private WebElement proceedCheckoutBtn;
	@FindBy(xpath="//button[@class='promoBtn']") private WebElement applyPromocodeBtn;
	@FindBy(xpath="//button[contains(text(),'Place Order')]") private WebElement placeOrderBtn;
	@FindBy(xpath="//div[@class='products']//select") private WebElement selectCountryDD;
	@FindBy(xpath="//input[@type='checkbox']") private WebElement TCcheckbox;
	@FindBy(xpath="//button[contains(text(),'Proceed')]") private WebElement proceedBtn;
	
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void searchProductOnLandingPage(String prodName) {
		searchProduct.sendKeys(prodName);
	}
	
	
	public void addProductToTheCart(int num) throws InterruptedException {
		for (int i = 0; i < num; i++) {
			System.out.println(i);
			Thread.sleep(500);
	        increaseItem.click();
	        
	    }
	}
	
	public void clickOnAddToCartButton() {
		AddToCartBtn.click();
	}
	
	public void clickOnCartIcon() {
		CartIcon.click();
	}
	
	public void clickOnProccedToCheckoutButton() {
		proceedCheckoutBtn.click();
	}
	
	public boolean verifyPromoCode() {
		return applyPromocodeBtn.isDisplayed();
	}
	
	public void clickOnPlaceOrderButton() {
		placeOrderBtn.click();
	}
	
	public void selectCountry() {
		GernericUtils.select(selectCountryDD, "India");
	}
	
	public void clickonTermandConditionCheckbox() {
		TCcheckbox.click();
	}
	
	public void clickOnProceedButton() {
		proceedBtn.click();
	}

}
