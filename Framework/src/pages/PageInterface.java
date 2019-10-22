package pages;

import org.openqa.selenium.WebDriver;

public class PageInterface 
{	
	public Homepage homePage;
	public FlightFinder FlightFinder;
	public PageInterface(WebDriver dr)
	{
		 homePage=new Homepage(dr);
		 FlightFinder= new FlightFinder (dr);
	}
	
	
	//Add Objects of other as well 
	
}
