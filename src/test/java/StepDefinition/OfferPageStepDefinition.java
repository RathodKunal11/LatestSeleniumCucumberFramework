package StepDefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import PageObjects.OfferPage;
import Utils.TextContextSetup;
import io.cucumber.java.en.Then;

public class OfferPageStepDefinition {
	
    TextContextSetup textcontextsetup;
    public OfferPage offerPage;
	 
	 public OfferPageStepDefinition(TextContextSetup textcontextsetup) {
		 this.textcontextsetup=textcontextsetup;
		 offerPage=textcontextsetup.pageObjectManager.getOfferPage();
	 }

	
	@Then("^user search same product with shortname (.+)in the offer page to check if product exist$")
	public void user_search_same_product_with_shortname_in_the_offer_page_to_check_if_product_exist(String name) {
//		OfferPage offerPage=new OfferPage(textcontextsetup.driver);
		
		offerPage.SearchProductOnOfferPage(name);
		String OfferPageProductName = offerPage.getProductNameFromOfferPage();
		Assert.assertEquals(textcontextsetup.HomePageProductName, OfferPageProductName);
		System.out.println("Product search with shortname on home page and offer page are extactly same");
	    
	}
}
