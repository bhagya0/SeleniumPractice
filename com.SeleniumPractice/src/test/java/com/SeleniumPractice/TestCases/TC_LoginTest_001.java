package com.SeleniumPractice.TestCases;
import com.SeleniumPractice.PageObject.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void LoginTest()
	{
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		
		lp.clickSubmit();
		
		if(driver.getCurrentUrl().equals("https://demo.guru99.com/v4/manager/Managerhomepage.php"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
}
