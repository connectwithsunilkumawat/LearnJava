package asserations;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependencyOnSingleMethodExample {

	@Test(dependsOnMethods = "X")
	public void Z()
	{
		System.out.println("Z");	
	}
	
	@Test
	public void Y()
	{	
		System.out.println("Y");
	}
	
	@Test
	public void X()
	{	
		System.out.println("X");
		assertTrue(false);
	}
	
	@Test(dependsOnMethods = "R")
	public void W()
	{	
		System.out.println("W");	
	}
	
	@Test
	public void R()
	{	
		System.out.println("R");	
	}
	
	
}
