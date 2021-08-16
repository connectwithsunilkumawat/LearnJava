package asserations;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependencyOnMultiplesMethodExample {

	@Test(dependsOnMethods = {"X" , "W" , "R"})
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
		
		
	}
	
	@Test
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
