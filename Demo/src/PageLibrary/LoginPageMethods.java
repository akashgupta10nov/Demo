package PageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageMethods {
	
	
	public static void ClickMethod_Button(WebDriver driver, String Xpath)
	{
		
		WebElement Button = driver.findElement(By.xpath(Xpath));
		Button.click();
		
		
		
	}

}
