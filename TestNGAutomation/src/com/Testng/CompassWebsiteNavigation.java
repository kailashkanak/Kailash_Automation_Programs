package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompassWebsiteNavigation {
	WebDriver driver;
	@BeforeMethod
	public void SetUpBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAILASH KANAK\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.getcompass.ai/");
	}
	
	
	@Test
	public void NavigateWebsite() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='primary-btnn _2nd nav log w-inline-block']")).click();
		String title = driver.getTitle();
		System.out.println("Page Title = "+title);
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class='primary-btnn na-v dm w-inline-block']")).click();
		title=driver.getTitle();
		System.out.println("New page title = "+title);
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class='primary-btnn _2nd nav no-bd w-inline-block']")).click();
		title=driver.getTitle();
		System.out.println("Page Title ="+ title);
		Thread.sleep(2000);
		driver.navigate().back();
		
	}

}
