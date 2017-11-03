package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestBase {
	
	public WebDriver driver;
	public Properties pro;
	

	public void LoadPropertyFile() throws IOException
	{
		
		pro = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\akash.gupta\\workspace\\Demo\\Config.properties");
		pro.load(fis);
		
		
	}
	
	@BeforeTest
	public void OpenBrowser() throws IOException
	{
		LoadPropertyFile();
		if(pro.getProperty("Browser").equalsIgnoreCase("chrome"))
		{
			File file = new File("D:\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			 driver = new ChromeDriver();
			
		}
		
		else if(pro.getProperty("Browser").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		   
		}
		
		else
		{
			driver= new InternetExplorerDriver();
		}
		
		driver.get(pro.getProperty("url"));
		
		
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}
	

}
