package StepDefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import Utils.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPageStepDefinition {
	
	 public WebDriver driver;
//	 String HomePageProductName;
	 String shortName;
	 TextContextSetup textcontextsetup;
	 public LandingPage landingPage;
	 
	 public LandingPageStepDefinition(TextContextSetup textcontextsetup) {
		 this.textcontextsetup=textcontextsetup;
		 landingPage=textcontextsetup.pageObjectManager.getLandingPage();
	 }
	
	@Given("user is on green cart landing page")
	public void user_is_on_green_cart_landing_page() throws IOException {
		textcontextsetup.testBase.WebDriverManager();

	   
	   
	}
	

	@When("^when user search product with shortname (.+) and extracted the actual name of product$")
	public void when_user_search_product_with_shortname_and_extracted_the_actual_name_of_product(String shortName) {
		
		landingPage.searchProductOnLandingPage(shortName);
		textcontextsetup.HomePageProductName=landingPage.getProductNameFromLandingPage();
		landingPage.clickOnAddToCartButton();
		landingPage.clickOnTopDealLink();
		textcontextsetup.genericUtils.switchToChildWindow();
	    
	}
	

	
	
	

}
