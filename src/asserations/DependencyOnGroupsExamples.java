package asserations;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependencyOnGroupsExamples {

	@Test(dependsOnGroups = "Group1")
	public void A()
	{
		System.out.println("A");	
	}
	
	@Test(groups = "Group1")
	public void Y()
	{	
		System.out.println("Y");
	}
	
	@Test(groups = "Group1")
	public void X()
	{	
		System.out.println("X");
	}
	
	
	@Test(groups = "Group2")
	public void AA()
	{	
		System.out.println("AA");
		assertTrue(false);
	}
	
	@Test(dependsOnGroups = "Group2")
	public void AAA()
	{	
		System.out.println("AAA");
		
	}
	
}
