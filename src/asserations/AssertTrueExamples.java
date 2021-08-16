package asserations;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueExamples 
{
	@Test
	public void Test1()
	{
		assertTrue(testHigh(1000,200));	
	}
	
	@Test
	public void Test2()
	{	
		assertTrue(testHigh(1000,200),"A is not high");
	}
	
	
	public boolean testHigh(int a , int b)
	{
		boolean result;
		if(a>b)
			result = true;
		else
			result = false;
		return result;
	}
}