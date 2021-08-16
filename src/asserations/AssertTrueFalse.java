package asserations;

import org.testng.Assert;
import org.testng.Assert.*;
import org.testng.annotations.Test;

public class AssertTrueFalse {
	
	@Test 
	public void A()
	{
		Assert.assertTrue(Calculation(100, 20));
	}
	
	@Test 
	public void B() // it need true to get pass
	{
		Assert.assertTrue(Calculation(10, 20) , "Result is not greater than 100");
	}
	
	@Test 
	public void C()
	{
		Assert.assertFalse(Calculation(10, 20));
	}
	
	@Test 
	public void D() // it need false to get pass
	{
		Assert.assertFalse(Calculation(110, 90), "Result is greater than 100");
	}
	
	
	
	
	
	public boolean Calculation(int a , int b)
	{
		int result;
		result = a + b;
		if(result > 100)
		 return true;
		else
		 return false;
		
	}
	
	
	

}
