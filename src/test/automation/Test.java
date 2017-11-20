package test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test extends Setup
{

	public static void main (String[] args) {
		
		Test tst = new Test();
		tst.setup();
		tst.Testdrive();
		
	}
	
	public void Testdrive() {
		
		WebElement el = driver.findElement(By.linkText("Test Drive"));
		el.click();
		
		
	}
	public void form1() {
		
		driver.findElement(By.name("first_name")).sendKeys("varun");
		driver.findElement(By.name("last_name")).sendKeys("nadim");
		driver.findElement(By.name("")
	}
}
