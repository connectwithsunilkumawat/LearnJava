package asserations;

import org.testng.annotations.Test;

public class Parent {
	
	@Test(dependsOnMethods = "V2")
	public void V1()
	{
		System.out.println("V-1");
	}
	
	@Test
	public void V2()
	{
		System.out.println("V-2");
	}

}
