package walmart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMwalmart extends base {

	
	
	@FindBy(css = " #search-form-input")
	WebElement search;
	
	
	@FindBy (css = "#departments-button")
	WebElement departments;
	
	
	public POMwalmart() {
		PageFactory.initElements(driver, this);
	}
	public void Test1 () {
		search.sendKeys("Hello");
	}
	
	public void Test2 () {
		departments.click();
	}
	
}
