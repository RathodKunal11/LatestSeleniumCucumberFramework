package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;
import StepDefinition.Hooks;

public class TextContextSetup {
	
	 public WebDriver driver;
	 public  String HomePageProductName;
	 public String shortName;
	 public PageObjectManager pageObjectManager;
	 public TestBase testBase;
	 public GernericUtils genericUtils;
	 
	 
	public TextContextSetup() throws IOException {
		testBase=new TestBase();
		pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
		genericUtils=new GernericUtils(testBase.WebDriverManager());
		
		
	}
	

}
