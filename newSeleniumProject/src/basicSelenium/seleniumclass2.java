package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumclass2 
{
	@Test
	public void test()
	{
		//link
		System.out.println("Launch chrome browser");
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.manage().window().maximize();
		
		//link
				System.out.println(dr.findElement(By.linkText("REGISTER")).getText());
				System.out.println(dr.findElement(By.linkText("REGISTER")).getAttribute("href"));
			
		dr.findElement(By.partialLinkText("ISTER")).click();
	}

}
