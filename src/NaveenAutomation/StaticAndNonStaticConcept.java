package NaveenAutomation;

public class StaticAndNonStaticConcept 
{

	int a = 10;
	static String b = "Sunil";
	
	public void NonStatic()
	{
		System.out.println("NonStatic");
	}
	
	public static void Static()
	{
		System.out.println("Static");
	}
	
	public static void main(String[] args) 
	{
		 System.out.println(b);
		 System.out.println(StaticAndNonStaticConcept.b);
		 
		 Static();
		 StaticAndNonStaticConcept.Static();
		 
		 StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		 
		 System.out.println(obj.b);
		 obj.Static();
		 
		 System.out.println(obj.a);
		 obj.NonStatic();
		 
		 
	}

}
