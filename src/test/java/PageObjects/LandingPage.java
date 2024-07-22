package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	@FindBy(xpath="//input[@type='search']") private WebElement searchProduct;
	@FindBy(xpath="//div[@class='product']//h4") private WebElement homePageProductName;
	@FindBy(xpath="//div[@class='product-action']/button") private WebElement AddToCartBtn;
	@FindBy(xpath="//a[contains(@href,'offers')]") private WebElement TopDealLink;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void searchProductOnLandingPage(String prodName) {
		searchProduct.sendKeys(prodName);
	}
	
	public String getProductNameFromLandingPage() {
		return homePageProductName.getText().split("-")[0].trim();
	}
	
	public void clickOnAddToCartButton() {
		AddToCartBtn.click();
	}
	
	public void clickOnTopDealLink() {
		TopDealLink.click();
	}
	
	

}
