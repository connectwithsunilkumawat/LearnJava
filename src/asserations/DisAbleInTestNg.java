package asserations;

import org.testng.annotations.Test;

public class DisAbleInTestNg {
	
	@Test
	public void T1()
	{
		System.out.println("T1");
	}
	
	@Test(enabled = false)
	public void T2()
	{
		System.out.println("T2");
	}

}
