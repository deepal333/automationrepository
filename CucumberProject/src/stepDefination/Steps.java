package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps 
{
	WebDriver dr;
	
	
	
	
	@Given("^Application is up and running$")
	public void application_is_up_and_running() throws Throwable 
	{
	   System.out.println();
	   System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	   
	   dr=new ChromeDriver();
	   dr.get("http://www.newtours.demoaut.com/");
	   dr.manage().window().maximize();
	}

	@When("^I enter (.*?) and (.*?) on login page")
	public void i_enter_valid_credentials(String userName, String Password) throws Throwable
	{
		WebElement username=dr.findElement(By.name("userName"));
		username.sendKeys("mercury");
		dr.findElement(By.name("userName")).sendKeys("userName");
		
		dr.findElement(By.name("password")).sendKeys("password");
		
		dr.findElement(By.name("login")).click();

	}

	@Then("^I should be logged in successfully$")
	public void i_should_be_logged_in_successfully() throws Throwable
	{
		String temp=dr.getTitle();
		
		Assert.assertTrue(temp.contains("Find a Flight"));

	}
	
	
	@When("^I enter valid credentials$")
	public void i_enter_multiple_valid_credentials() throws Throwable
	{
		WebElement username=dr.findElement(By.name("userName"));
		username.sendKeys("mercury");
		dr.findElement(By.name("userName")).sendKeys("mercury");
		//Textbox
		dr.findElement(By.name("password")).sendKeys("mercury");
		//button
		dr.findElement(By.name("login")).click();

	}
}
