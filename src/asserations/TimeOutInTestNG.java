package asserations;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TimeOutInTestNG 
{
	@Test
	public void T1()
	{
		System.out.println("T1");
	}
	
	@Test(timeOut = 1000)
	public void T2()
	{
		System.out.println("T2");
		int i = 0;
		while(i > -1)
		{
			++i;
			System.out.println(i);
		}
	}
	
}
