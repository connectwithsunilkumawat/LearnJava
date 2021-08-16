package Strings;

public class Strings 
{

	public static void main(String[] args) 
	
/*	String in java uses concept of String Pool literal. 
	When a string is created and if the string already exists in the pool, 
	the reference of the existing string will be returned, instead of creating a 
	new object and returning its reference.If a string is not immutable, changing the string 
	with one reference will lead to the wrong value for the other references.

	I would add one more thing, since String is immutable, it is safe
	for multi threading and a single String instance can be shared across 
	different threads. This avoid the usage of synchronization for thread safety, 
	Strings are implicitly thread safe. */
	
	
	{
		String s = "Sharma";
		String ss = new String("Sharma");
		String sss = new String("Sharma");
		char c [] = {'S','U','N','I','L'};
		String cc = new String(c);
		
		StringBuilder sbb;
		

	}

}
