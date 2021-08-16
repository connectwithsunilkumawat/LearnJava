package GroupingInTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups = {"AB" , "ABC"})
	public void A()
	{
		System.out.println("A");
	}
	
	@Test(groups = "AB")
	public void B()
	{
		System.out.println("B");
	}
	
	@Test(groups = "CD")
	public void C()
	{
		System.out.println("C");
	}
	
	@Test(groups = "CD")
	public void D()
	{
		System.out.println("D");
	}
	
	@Test(groups = "EF")
	public void E()
	{
		System.out.println("E");
	}
	
	@Test(groups = "EF")
	public void F()
	{
		System.out.println("F");
	}
	
	

}
