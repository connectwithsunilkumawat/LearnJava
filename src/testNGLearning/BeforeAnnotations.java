package testNGLearning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class BeforeAnnotations 
{
	@BeforeClass
	public void BeforeClassMethod() 
	{
		System.out.println("Run Once Before Class");
	}
	
	@BeforeMethod
	public void BeforeTestMethod() 
	{
		System.out.println("Run Before Every Test");
	}
	
	@Test
	public void TestMethod_1() 
	{
		System.out.println("Test-1");
	}
	
	@Test
	public void TestMethod_2() 
	{
		System.out.println("Test-2");
	}
}
