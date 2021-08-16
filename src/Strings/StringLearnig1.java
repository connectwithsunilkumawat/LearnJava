package Strings;

public class StringLearnig1 
{

	public static void main(String[] args)
	{
		char[] ch1 = new char []{'S','U','N','I','L'};
		String st1 = new String("SUNIL");
		
		System.out.println("Char :-"+ch1);
		System.out.println(ch1);
		System.out.println("String : -"+ st1);
		System.out.println(st1);
		
		String st2 = "A"; // 97 decimal or Unicode
		String st3 = "a"; //65 decimal or Unicode
		
		System.out.println(st2.compareTo(st3));  // st2 > st3
		System.out.println(st3.compareTo(st2));  // st2 > st3
		
		System.out.println(st2.compareToIgnoreCase(st3));
		System.out.println(st3.compareToIgnoreCase(st2));
		
		System.out.println(String.join(",",st2,st3 ));  //A,a
		
		
		
		
		
		

	}

}
