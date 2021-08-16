package NaveenAutomation.Inheritence;

public class TestCar {

	public static void main(String[] args) 
	{
		// Static Polymorphism  or Compile time Polymorphism
		BMW obj = new BMW();
		obj.start();
		obj.stop();
		obj.refuel();
		obj.theftSafety();
		obj.engine();
		
		System.out.println("-------------------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		Car c1 =  new BMW(); //child class Object can be referred by parent class reference variable - Dynamic polymorphism or Run time polymorphism or Top Casting
		
		// by c1 only overidden method and c1 own method can be called
		
		System.out.println("***************");
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		System.out.println("***************");
//		BMW b1 =  new Car(); // Not Allow
		
		//Down Casting
		BMW b1 =  (BMW)new Car(); //will get the error at run time as - java.lang.ClassCastException:
		
		
		
		
		
	}

}
