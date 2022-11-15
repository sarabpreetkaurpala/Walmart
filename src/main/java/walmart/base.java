package walmart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public static WebDriver driver;
	
	public static void initiate () {
		
			
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sarab\\eclipse-workspace\\AMAZON\\geckodriver.exe");
		
	driver = new FirefoxDriver();
		
		driver.get("https://www.walmart.ca/en");
		driver.manage().window().maximize();
	}
	
	
	
	
	
	

}
