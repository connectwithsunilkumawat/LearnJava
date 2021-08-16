package NaveenAutomation.Inheritence;

public class BMW extends Car
{
	//Same method is present in the child class as well as in the parent class with the same name and same number of parameter is call method over riding
	
	public void start() // Overridden method
	{
		System.out.println("BMW Automatic*******Start");
	}
	
	
	
	public void theftSafety()
	{
		System.out.println("BMW Theft*******Safety Car");
	}
	
	
	
}
