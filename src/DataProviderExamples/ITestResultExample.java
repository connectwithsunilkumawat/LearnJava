package DataProviderExamples;

import static org.testng.Assert.assertTrue;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ITestResultExample {
	
	@Test
	public void A()
	{
		System.out.println("A");
		assertTrue(true);
	}
	
	@Test
	public void B()
	{
		System.out.println("B");
		assertTrue(false);
	}
	
	@AfterMethod
	public void result(ITestResult result)
	{
		if(result.getStatus() == ITestResult.SUCCESS)
		{
			System.out.println("Pass: Method name is "+result.getMethod().getMethodName());
		}
		else if(result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println("Fail: Method name is "+result.getMethod().getMethodName());
		}
	}
}
