package StepDefinition;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.TextContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks {

	TextContextSetup textcontextsetup;

	public Hooks(TextContextSetup textcontextsetup) {
		this.textcontextsetup = textcontextsetup;
	}

	@After
	public void AfterScenario(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) textcontextsetup.testBase.WebDriverManager())
					            .getScreenshotAs(OutputType.BYTES);
			Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
		}
		textcontextsetup.testBase.WebDriverManager().quit();
	}

}
