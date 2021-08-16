package DataProviderExamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInSeprateClassExample 
{

	@Test(dataProvider = "NumberInput" , dataProviderClass = DataProviderExamp.class)
	public void addition(int a , int b)
	{
		int sum = a + b;
		System.out.println("Addition of two number are: "+sum);
	};

	
};
