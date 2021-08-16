package asserations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

//Hard Assert - Statement after the failed assertion would not get executed.
public class HardAssertExamples 
{
	@Test
	public void A()
	{
		assertEquals(testHigh(10,5),true);	
		System.out.println("Kumawat");
	}
	
	@Test
	public void B()
	{
		try
		{
		assertEquals(testHigh(1,5),true);
		}
		
		catch(Throwable e) 
		{
		   System.out.println("Sunil"); // printed if above assertion get failed but not print if above assertion get pass
		}
	}
	
	
	
	
	public boolean testHigh(int a , int b)
	{
		
		if(a>b)
			return true;
		else
		   return false;
	}
	
}