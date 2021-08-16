package NaveenAutomation;


public class MethodOverLoading {

	
	
	
	
	public MethodOverLoading()
	{
		System.out.println("I am Constractor");
	}
	
	//Method Overloading - when the method name is same with different number of input parameter and different type of input parameter within the same class.
	
	public void add(int a)
	{
		System.out.println("Add: "+a);
	}
	
	public void add(double a)
	{
		System.out.println("Add: "+a);
	}
	
	public void add(int a , int b)
	{
		System.out.println("Addition: "+ (a+b));
	}
	public void add(int a , int b , int c)
	{
		System.out.println("Addition: "+ (a+b+c) );
	}
	public static void main(String[] args) {
		
		MethodOverLoading m = new MethodOverLoading();
		m.add(10);
		m.add(10, 20);
		m.add(10, 20, 30);
		
	}
	
	
	
}
