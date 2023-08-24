package com.SeleniumPractice.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadConfig {

	Properties pro;
	

	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream (src);
			pro= new Properties ();
			pro.load(fis);
			
		}
		catch(Exception e) {
			System.out.println("Exception is " + e.getMessage());
			
			
		}
		
		System.out.println(pro.getProperty("baseURL"));
		
	}
	
	
	
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
		String username = pro.getProperty("uname");
		return username;
	}
	
	public String getUserPassword()
	{
		String password = pro.getProperty("pwd");
		return password;
	}
	
	public String getChromePath()
	{
		String chromepath = pro.getProperty("chrome");
		return chromepath;
	}	
	
	public String getFirefoxPath()
	{
		String firefoxpath = pro.getProperty("firefox");
		return firefoxpath;
	}
	
	public String getIEPath()
	{
		String iepath = pro.getProperty("internetexproler");
		return iepath;
	}
	
	
	
	
	
	
	
	
}
