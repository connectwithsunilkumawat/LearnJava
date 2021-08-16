package NaveenAutomation;

public class CallByValueAndCallByReference 
{
	int p , q;
	

	public static void main(String[] args) 
	{
		
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		 
		System.out.println("Value: "+obj.add(10, 40)); //call by value OR pass by value
		
		obj.p = 1000;
		obj.q = 5000;
		
		System.out.println("P Value: "+ obj.p + " And Q Value: "+obj.q);
		
		obj.swap(obj); //Call by reference
		
		System.out.println("P Value: "+ obj.p + " And Q Value: "+obj.q);
		
		
		
	}
	
	public int add(int a , int b)
	{
		a = 100;
		b = 500;
		int c = a + b;
		return c;
	}
	
	//Call by reference
	public void swap(CallByValueAndCallByReference object)
	{
		int temp ;
		temp = object.p;
		object.p = object.q;
		object.q = temp;
	}

}
