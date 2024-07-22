package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferPage {
	
	@FindBy(xpath="//input[@type='search']") private WebElement searchProduct;
	@FindBy(xpath="(//tbody//td)[1]") private WebElement offerPageProductName;
	@FindBy(xpath="//div[@class='product-action']/button") private WebElement AddToCartBtn;
	@FindBy(xpath="//a[contains(@href,'offers')]") private WebElement TopDealLink;
	
	public OfferPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void SearchProductOnOfferPage(String prodName) {
		searchProduct.sendKeys(prodName);
	}
	
	public String getProductNameFromOfferPage() {
		return offerPageProductName.getText().trim();
	}
	
	

}
