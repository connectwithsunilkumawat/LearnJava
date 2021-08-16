package NaveenAutomation;

import javax.management.RuntimeErrorException;

public class FinalKeyWordConecept {

	public static void main(String[] args) {

		int i = 10;
		System.out.println(i);
		
		i=20;
		System.out.println(i);
		
		i=30;
		System.out.println(i);
		
		final int j = 100; // constant value 
		
		// final variable value can't be changed once assined 
		// final class can't be extended means final class don't have any child
		//final method can't be override
		
		System.out.println(j);
		
		//j = 200; // can not be reassigned a new value
		
		Test1();
		Test2();
		
		FinalKeyWordConecept f1 = new FinalKeyWordConecept();
		FinalKeyWordConecept f2 = new FinalKeyWordConecept();
				
		f1 = null;
		
		System.gc();
	}
	
	// Finally Block will get call in any condition error came or not
	
	public static void Test1()
	{
		try 
		{
			System.out.println("Test1 Try Block ");
			throw new RuntimeException("e");
		}
		catch(Exception e)
		{
			System.out.println("Test 1 Catch Block");
		}
		
		finally 
		{
			System.out.println("Test1 Finally Block");
		}
	}
	
	public static void Test2()
	{
		try 
		{
			System.out.println("Test 2 Try Block ");
			
		}
		catch(Exception e)
		{
			System.out.println("Test 2 Catch Block");
		}
		
		finally 
		{
			System.out.println("Test 2 Finally Block");
		}
	}
	
	public void finalize()
	{
		System.out.println("Finalize Method Get Called Just Before The Grabase collector get called for some cleanup task");
	}
	
	
			
	
	

}
