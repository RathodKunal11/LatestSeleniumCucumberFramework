package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GernericUtils {
	
	public WebDriver driver;
	
	public GernericUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void switchToChildWindow() {
		Set<String> IDs =driver.getWindowHandles();
		Iterator<String> itr = IDs.iterator();
		String firstWindow = itr.next();
		String secondWindow=itr.next();
		driver.switchTo().window(secondWindow);
	}
	
	public static void select(WebElement element, String eleName) {
		Select s=new Select(element);
		s.selectByVisibleText(eleName);
	}

}
