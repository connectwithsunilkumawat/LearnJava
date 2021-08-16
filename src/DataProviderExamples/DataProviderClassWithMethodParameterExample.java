package DataProviderExamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClassWithMethodParameterExample 
{

	@Test(dataProvider = "NumberInputs" , dataProviderClass = DataProviderWithParameter.class)
	public void addition_One(int a , int b)
	{
		int sum = a + b;
		System.out.println("Addition of two number are: "+sum);
	};
	
	
	
	@Test(dataProvider = "NumberInputs" , dataProviderClass = DataProviderWithParameter.class)
	public void addition_Two(int a , int b)
	{
		int sum = a + b;
		System.out.println("Addition of two number are: "+sum);
	};

	
};
