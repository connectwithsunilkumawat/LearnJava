package Strings;

public class StringImmutabe
{

	public static void main(String[] args)
	{
		String s = new String("Sunil");
		String s1 = new String("Samarth");
		
		s.concat(" Kumawat");
		System.out.println(s); // its print Sunil only , this is string Immutable 
		
		s1 = s1.concat(" Kumawat"); // here we are changing reference also	
		System.out.println(s1); 
		
		
		//Below only one object is created , and all references st1 , st2 , st3 , st4 and st5 point to the object who contains Sunil
		String st1 = "Sunil"; 
		String st2 = "Sunil";
		String st3 = "Sunil";
		String st4 = "Sunil";
		String st5 = "Sunil";
		st5.toUpperCase();
		System.out.println(st5.toUpperCase());
		
		String ss1 = new String("Samarth");
		String ss2 = new String("Samarth");
		String ss3 = "Samarth";
		if(ss1 == ss2) // == check reference (address)
		{
			System.out.println("True");
		}
		else if(ss1.equals(ss2)) // check content of string
		{
			System.out.println("False");
		}
		else if(ss1.equals(ss3))
		{
			System.out.println("False");
		}
		
		

	}

}
