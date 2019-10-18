package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumclass3 
{
	@Test
	public void test()
	{
		//checkbox
		System.out.println("Launch chrome browser");
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		
		dr.manage().window().maximize();
		
		dr.switchTo().frame("iframeResult");
		
		WebElement ele= dr.findElement(By.name("vehicle1"));
		ele.click();
		System.out.println(ele.isSelected());
		
		
		
	}
}
