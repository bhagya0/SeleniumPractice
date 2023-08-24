package com.SeleniumPractice.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL = "http://demo.guru99.com/v4/index.php";
	public String username="mngr522270";
	public String password="synAdAb";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".//Drivers//msedgedriver.exe");
		//driver= new ChromeDriver();
		driver = new EdgeDriver();
		
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	

}
