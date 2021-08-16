package asserations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//Hard Assert - Statement after the failed assertion would not get executed.
public class SoftAssertionExamples 
{
	SoftAssert sa = new SoftAssert();
	@Test
	public void A()
	{
		sa.assertEquals(testHigh(10,5),true);	
		System.out.println("Kumawat");
	}
	
	@Test
	public void B()
	{
		sa.assertEquals(testHigh(1,5),true);
		System.out.println("Sunil");
		sa.assertAll(); // if not use this , this assertion get pass even it should be failed
		
	}
	
	
	
	
	public boolean testHigh(int a , int b)
	{
		
		if(a>b)
			return true;
		else
		   return false;
	}
	
}