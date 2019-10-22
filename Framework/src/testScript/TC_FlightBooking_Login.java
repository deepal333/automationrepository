package testScript;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import configuraation.Configuration;
import libraries.ApplicationLibrary;
import pages.PageInterface;

public class TC_FlightBooking_Login 
{
	PageInterface page=null;
	WebDriver dr=null;
	ApplicationLibrary lib;
	
	
	@BeforeClass
	public void initialize()
	{
		lib= new ApplicationLibrary();

		//Launch Browser
		dr=lib.launchBrowser("Chrome");
		
		page= new PageInterface(dr);
	}
	
	@Test
	public void loginTest()
	{
		lib.navigate(dr, Configuration.url);
		String temp=page.homePage.login(Configuration.globalUserName, Configuration.globalUserPassword);
		
		Assert.assertTrue(temp.contains("Find a Flight"));
	}
	@Test
	public void logoutTest()
	{
		String temp=page.FlightFinder.clickStringOff();
		
		Assert.assertTrue(temp.contains("Sign-On"));
	}
	
	
	@AfterClass
	public void tearDown()
	{
		dr.quit();
	}
}
