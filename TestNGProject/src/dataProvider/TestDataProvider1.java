package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider1 
{
	@Test(dataProvider="getData")
	public void login(String user, String Pass)
	{
		System.out.println("Test Login with Username="+user+" and password="+Pass);
	}
	
	@DataProvider
	public String[][] getData()
	{
		String[][] data= new String[3][2];
		
		//Row 1
		data[0][0]="Username 1";
		data[0][1]="Password 1";
		
		//Row 2
		data[1][0]="Username 2";
		data[1][1]="Password 2";
		
		//Row 3
		data[2][0]="Username 3";
		data[2][1]="Password 3";
		
		return data;
		
		
	}
}
