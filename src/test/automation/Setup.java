package test.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup {

	public WebDriver driver;
		
			public void setup() {
		   System.setProperty("webdriver.gecko.driver","C:\\Users\\USER1\\Downloads\\geckodriver-v0.19.0-win64\\geckodriver.exe");	
		    driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://test.winnow.co");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        

		
	

}
}
