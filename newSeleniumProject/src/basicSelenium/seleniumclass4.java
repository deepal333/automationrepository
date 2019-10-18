package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumclass4 
{
	
	@Test
	public void login() throws InterruptedException
	{
		System.out.println("Launch chrome browser");
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.manage().window().maximize();
		
		System.out.println(dr.findElement(By.xpath("//img[@alt='Mercury Tours']")).getAttribute("height"));
		
		
	}
}
