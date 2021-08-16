package NaveenAutomation;

public class WrapperClassConcept {


	public static void main(String[] args) 
	{
		String x = "100";
		int y = 200;

		System.out.println("It show are String: "+ (x+y));

		int z = Integer.parseInt(x);
		System.out.println("Converted into int: "+ (z+y));

		//Integer , Double , Character , Boolean

		String a = "A";
		boolean ab = 	Boolean.parseBoolean(a);
		System.out.println("It is String: "+a);
		System.out.println("Now its boolean: "+ ab);
		
		System.out.println("It is int: "+ (y+200));
		String ss = String.valueOf(y);
		System.out.println("Now it String: " + (ss+200));
		
		
		String st = "1000A";
		System.out.println(Integer.parseInt(st)); //Number format exception at Run time
		


	}

}
