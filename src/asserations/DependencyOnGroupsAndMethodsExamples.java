package asserations;
import org.testng.annotations.Test;

public class DependencyOnGroupsAndMethodsExamples {

	@Test(dependsOnGroups = "Group101")
	public void ABC()
	{
		System.out.println("ABC");	
	}
	
	@Test(groups = "Group101")
	public void YXY()
	{	
		System.out.println("YXY");
	}
	
	@Test(groups = "Group101" , dependsOnMethods = "XXXZ")
	public void XYZ()
	{	
		System.out.println("XYZ");
	}
	
	@Test
	public void XXXZ()
	{	
		System.out.println("XXXZ");
	}
	
}
