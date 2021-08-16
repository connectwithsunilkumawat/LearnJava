package NaveenAutomation;

public class ConstractorWithThisKeyword 
{
	//Global Variable
	String name; 
	int age;
	
	public ConstractorWithThisKeyword(String name , int age)
	{
		this.name = name; // Initializing Global variables
		this.age = age;   // Initializing global variables
		
		System.out.println("Name: "+name +" Age: "+age);
	}

	public static void main(String[] args) 
	{
		ConstractorWithThisKeyword obj = new ConstractorWithThisKeyword("Sunil",33);
		
	}

}
