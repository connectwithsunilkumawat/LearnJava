	package asserations;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;

public class AssertNullExamples {
	
	String s1 = null;
	String s2 = "Sunil";
	
	@Test
	public void Test_1()
	{
		assertNull(s1);
	}
	
	@Test
	public void Test_2()
	{
		assertNull(s2,"String is not null");
	}
	
	@Test
	public void Test_3()
	{
		assertNotNull(s2);
	}
	
	@Test
	public void Test_4()
	{
		assertNotNull(s1,"String is null");
	}

}
