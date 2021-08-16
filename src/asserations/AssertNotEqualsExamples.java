package asserations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEqualsExamples 
{
	@Test
	public void A_Boolean()
	{
		assertNotEquals(testHigh(1,5),true);	// if both value is not same than get pass
	}
	
	@Test
	public void B_Boolean()
	{	
		assertNotEquals(testHigh(10,5),true,"First number is greater than second");	
	}
	
	@Test
	public void C_Int()
	{	
		assertEquals(multiply(10,10),100);	
	}
	
	@Test
	public void D_Int()
	{	
		assertEquals(multiply(110,10),100 , "Result is not 100");	
	}
	
	@Test
	public void E_String()
	{	
		assertEquals(Message("Hello"), "Hello");	
	}
	
	@Test
	public void F_String()
	{	
		assertEquals(Message("Hello"), "Hi" , "Both String is not Same");	
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
	
	public int multiply(int a , int b)
	{
		int result = a * b;
		return result;
	}
	
	public String Message(String message)
	{
		return message;
	}
}