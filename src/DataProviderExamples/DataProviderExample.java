package DataProviderExamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample 
{

	@Test(dataProvider = "InputNumber")
	public void addition(int a , int b)
	{
		int sum = a + b;
		System.out.println("Addition of two number are: "+sum);
	};

	@DataProvider(name = "InputNumber")
	public Object[][] getDataFromDataProvider()
	{
		return new Object[][]
				{
					{10,20},
					{100,300}
				};
	};
};
