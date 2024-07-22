package StepDefinition;

import java.io.IOException;

import PageObjects.CheckoutPage;
import Utils.TextContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutPageStepDefinition {
	public TextContextSetup textcontextsetup;
	public CheckoutPage checkoutPage;
	
	public CheckoutPageStepDefinition(TextContextSetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
		checkoutPage = textcontextsetup.pageObjectManager.getCheckoutPage();
	}
	
//	@Given("^user is on green cart landing page$")
//	public void user_is_on_green_cart_landing_page() throws IOException {
//		textcontextsetup.testBase.WebDriverManager();
//	}

	@When("^user search product with shortname (.+)$")
	public void user_search_product_and_extract_actual_name(String shortName) {
		
		checkoutPage = textcontextsetup.pageObjectManager.getCheckoutPage();
	    checkoutPage.clickOnAddToCartButton();
	    checkoutPage.searchProductOnLandingPage(shortName);
	    
	}

	@And("^add product (.+) to the cart$")
	public void add_product_to_cart(int noOfItems) throws InterruptedException {
		
		System.out.println(noOfItems);
		checkoutPage.addProductToTheCart(noOfItems);
		checkoutPage.clickOnAddToCartButton();
		checkoutPage.clickOnCartIcon();
		
		
		
	}

	@Then("^user proceeds to the checkout and validate the product name (.+) at the checkout page$")
	public void validate_product_at_checkout(String productName) {
		checkoutPage.clickOnProccedToCheckoutButton();
		
		
	}

	@And("^verify user has ability to enter promo code and place the order$")
	public void verify_promo_code_and_place_order() {
		checkoutPage.verifyPromoCode();
		checkoutPage.clickOnPlaceOrderButton();
		checkoutPage.selectCountry();
		checkoutPage.clickonTermandConditionCheckbox();
		checkoutPage.clickOnProceedButton();
	}


}
