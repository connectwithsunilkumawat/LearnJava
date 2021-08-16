package DataProviderExamples;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;


public class DataProviderWithParameter
{
	
	@DataProvider(name = "NumberInputs")
	public Object[][] getDataFromDataProvider(Method m)
	{
		if(m.getName().equalsIgnoreCase("addition_Two")) 
		{
		return new Object[][]
				{
					{10,20},
					{100,300}
				};
		}
		else
		{
			return new Object[][]
				{
						{45,20},
						{1100,3100}
				};
		}
	};
};
