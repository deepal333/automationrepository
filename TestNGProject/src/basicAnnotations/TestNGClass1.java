package basicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass1 
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class TestingClass 1");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class TestingClass 1");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method Testing Class 1");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method Testing Class 1");
	}
	
	@Test(priority=0)
	public void test3()
	{
		System.out.println("Testing 3");
	}
	
	@Test(priority=1)
	public void test4()
	{
		System.out.println("Testing 4");
	}
	
	@Test(priority=2)
	public void test1()
	{
		System.out.println("Testing 1");
	}
	
	@Test(priority=3)
	public void test2()
	{
		System.out.println("Testing 2");
	}
	
}
