	package asserations;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;

import org.testng.annotations.Test;

public class AssertSame {
	
	String s1 = "Sunil";
	String s2 = "Sunil";
	String s3 = "Kumawat";
	
	@Test
	public void Test_1()
	{
		assertSame(s1, s2);
	}
	
	@Test
	public void Test_2()
	{
		assertSame(s1, s3 , "s1 and s3 not refer to same object");
	}
	
	@Test
	public void Test_3()
	{
		assertNotSame(s1, s3);
	}
	
	@Test
	public void Test_4()
	{
		assertNotSame(s1, s2," Both object refering to same");
	}

}
