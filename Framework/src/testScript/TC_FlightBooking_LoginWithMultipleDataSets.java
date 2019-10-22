package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import configuraation.Configuration;
import libraries.ApplicationLibrary;
import pages.PageInterface;

public class TC_FlightBooking_LoginWithMultipleDataSets 
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
	
	@Test(dataProvider="getData")
	public void loginTest(String userName, String password)
	{
		lib.navigate(dr, Configuration.url);
		String temp=page.homePage.login(userName, password);
		
		Assert.assertTrue(temp.contains("Find a Flight"));
		
		temp=page.FlightFinder.clickStringOff();
		
		Assert.assertTrue(temp.contains("Sign-On"));
	}
	
	
	@AfterClass
	public void tearDown()
	{
		dr.quit();
	}
	
	
	@DataProvider
	public String[][] getData()
	{
		String[][] data= new String[2][2];
		
		//Row 1
		data[0][0]="mercury";
		data[0][1]="mercury";
		
		//Row 1
		data[1][0]="mercury1";
		data[1][1]="mercury1";
		
		return data;
	}
	
}
