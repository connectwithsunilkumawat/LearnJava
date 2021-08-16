package DataProviderExamples;
import org.testng.annotations.DataProvider;


public class DataProviderExamp
{
	
	@DataProvider(name = "NumberInput")
	public Object[][] getDataFromDataProvider()
	{
		return new Object[][]
				{
					{10,20},
					{100,300}
				};
	};
}
