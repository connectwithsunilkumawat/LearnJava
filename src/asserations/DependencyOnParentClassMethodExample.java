package asserations;

import org.testng.annotations.Test;

public class DependencyOnParentClassMethodExample extends Parent {

	@Test(dependsOnMethods = "V1")
	public void Z()
	{
		System.out.println("Z");	
	}
	
	@Test
	public void Y()
	{	
		System.out.println("Y");
	}
	
}
