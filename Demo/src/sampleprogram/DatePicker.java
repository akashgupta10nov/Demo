package sampleprogram;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class DatePicker {
	
	public static WebDriver driver;
	
   
	
	@Test
	public void OpenBrowser()
	{
		File file = new File("D:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		 driver = new ChromeDriver();
			//System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
			//driver = new ChromeDriver();
			
		}
		
		
		
	

}
	
	
	

