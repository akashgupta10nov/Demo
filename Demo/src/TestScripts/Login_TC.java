package TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageLibrary.LoginPageMethods;
import TestBase.TestBase;

public class Login_TC extends TestBase {
	
	@Test(description= "Checking login functionality", enabled=false)
	public void GmailLoginFunctionality_WrongEmail() throws IOException, InterruptedException
	{
	    
		WebElement GmailLink = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a"));
		GmailLink.click();
		WebElement Email_Txtbox = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		Email_Txtbox.sendKeys("akash@gmail.com");
		WebElement NextButton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span"));
		NextButton.click();
		WebElement ErrorMsg = driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]"));
		Thread.sleep(5000);
		String ErrorMsgText = ErrorMsg.getText();
		Thread.sleep(5000);
		if(ErrorMsgText.contains("Google Account"))
		{
			System.out.println("Successful");
			
		}
		
		else
		{
			System.out.println("Unsuccessful");
		}
		
		
	    }
	
	@Test(dataProvider = "TestDataProvider")
	public void TestLoginFunctionality_ValidCredentials(String username, String password) throws InterruptedException
	{
		WebElement GmailLink = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a"));
		GmailLink.click();
		Thread.sleep(3000);
		WebElement Email_Txtbox = driver.findElement(By.id("identifierId"));
		Email_Txtbox.sendKeys(username);
		//WebElement NextButton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span"));
		//NextButton.click();
		Thread.sleep(3000);
		LoginPageMethods.ClickMethod_Button(driver, "//*[@id=\"identifierNext\"]/content/span");
		Thread.sleep(3000);
		WebElement Password_Txtbox = driver.findElement(By.name("password"));
		Password_Txtbox.sendKeys(password);
		LoginPageMethods.ClickMethod_Button(driver, "//*[@id=\"passwordNext\"]/content/span");
		Thread.sleep(3000);
		WebElement ComposeButton = driver.findElement(By.xpath("//*[@id=\":if\"]/div/div"));
		String text= ComposeButton.getText();
		if(text.equalsIgnoreCase("compose"))
		{
			System.out.println("Login successful");
			Thread.sleep(3000);
			LoginPageMethods.ClickMethod_Button(driver, "//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span");
			Thread.sleep(3000);
			LoginPageMethods.ClickMethod_Button(driver, "//*[@id=\"gb_71\"]");
			Thread.sleep(3000);
			driver.get(pro.getProperty("url"));
		    Thread.sleep(3000);
		}
		
		else
		{
			
			System.out.println("Login not successful");
			driver.get(pro.getProperty("url"));
		}
		
		
	}
	
	@DataProvider
	public Object[][] TestDataProvider()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "akashgupta10nov@gmail.com";
		data[0][1] = "9891960212";
		
		data[1][0] = "gupta.akashnov@gmail.com";
		data[1][1] = "9891960212";
		
		return data;
	}
				
		
		
	}


