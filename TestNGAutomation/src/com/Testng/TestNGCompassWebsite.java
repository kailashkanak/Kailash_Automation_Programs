package com.Testng;import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGCompassWebsite {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAILASH KANAK\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.getcompass.ai/");
	}
	@Test
	public void pageTitleValidation()
	{
		String expec_title = "Sales Commission Automation Platform | Compass";
		String actual_title = driver.getTitle();
		System.out.println("Actual Title = "+actual_title);
		System.out.println("Expected Title = "+expec_title);
		Assert.assertEquals(actual_title, expec_title);
		
			if(actual_title.equals(expec_title))
			{
				System.out.println("Page Title matched");
			}
			else
			{
				System.out.println("Page title doesn't match");
			}
			
	}
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Closing The browser");
		driver.close();
	}
	
	

}
