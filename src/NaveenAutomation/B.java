package NaveenAutomation;

public class B extends A 
{
	
	//Super keywork should be first statement in the constractor
	public B()
	{
		//super(100); // used to call parent class constructor
		super(100,200);
		System.out.println("Child Class");
	}
	
	
	public B(int i )
	{
		
		super(i);
		System.out.println("Child Class");
	}
	
	public B(int i , int j)
	{
		
		super(i,j);
		System.out.println("Child Class");
	}

	public static void main(String[] args) 
	{
		B obj = new B();
		B obj1 = new B(100);
		B obj2 = new B(100,200);
		
	}

}
