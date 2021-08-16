package asserations;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class PriortiyExample 
{
	@Test(priority = 0)
	public void Z()
	{
		System.out.println("A");	
	}
	
	@Test(priority = 1)
	public void Y()
	{	
		System.out.println("B");
	}
	
	@Test(priority = 2)
	public void X()
	{	
		System.out.println("C");	
	}
	
	@Test(priority = 3)
	public void W()
	{	
		System.out.println("D");	
	}
	
	@Test(priority = 4)
	public void R()
	{	
		System.out.println("E");	
	}
	
	@Test(priority = 5)
	public void T()
	{	
		System.out.println("F");	
	}
	
}
