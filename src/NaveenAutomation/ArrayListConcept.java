package NaveenAutomation;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) 
	{
		//Dynamic in nature
		//Can contains the duplicate values/element
		//Maintain the insertion order 

		ArrayList al = new ArrayList();

		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(400);

		System.out.println("Size of ArrayList: "+ al.size());
		System.out.println(al);



		al.remove(3);
		System.out.println("-----------------------------------");
		System.out.println("Size of ArrayList: "+ al.size());
		System.out.println(al);


		al.add(500);
		al.add(600);
		al.add(700);
		al.add(800);

		System.out.println("-----------------------------------");
		System.out.println("Size of ArrayList: "+ al.size());
		System.out.println(al);


		al.add("SUNIL");
		al.add("MANJU");
		al.add("SAMARTH");
		al.add("SAMER");

		System.out.println("-----------------------------------");
		System.out.println("Size of ArrayList: "+ al.size());
		System.out.println(al);

		System.out.println("-----------------------------------");
		System.out.println("Value at index 5 is: "+al.get(5));

		for(int i = 0 ; i<al.size();i++)
		{
			System.out.println("Value at index "+i+ " is: "+al.get(i));
		}


		ArrayList<Integer> al1 = new ArrayList <Integer>(); // we can add only add Integer values
		al1.add(99);
		al1.add(999);

		ArrayList<String> al2 = new ArrayList <String>(); // we can add only String values
		al2.add("Sunil Kumawat");

		ArrayList<E> al3 = new ArrayList <E>(); // when we are not sure which type of value we will get to store , in main method also <E> mentioned
		//     --------------------------		
		Employee emp1 = new Employee("Sunil", 32, "SSAQA");
		Employee emp2 = new Employee("Sartak", 30, "QA");
		Employee emp3 = new Employee("Shenu", 22, "AQA");

		ArrayList<Employee> al4 = new ArrayList<Employee>();
		al4.add(emp1);
		al4.add(emp2);
		al4.add(emp3);

		Iterator<Employee> it = al4.iterator();

		System.out.println("-----------------------------------");
		while(it.hasNext()) {

			Employee employee = it.next();
			System.out.println("Name: "+ employee.Name);
			System.out.println("Age: "+ employee.age);
			System.out.println("Job Title: "+ employee.JobTitle);

		}

		System.out.println("-----------------------------------");

		ArrayList<String> al5 = new ArrayList<String>();

		al5.add("Sunil");
		al5.add("Kumawat");


		ArrayList<String> al6 = new ArrayList<String>();

		al6.add("Suneel");
		al6.add("Kumavat");

		al5.addAll(al6);

		for(int i=0 ;i < al5.size() ; i++)
		{
			System.out.println("Values: "+al5.get(i));
		}

		System.out.println("-----------------------------------");

		al5.removeAll(al6);

		for(int i=0 ;i < al5.size() ; i++)
		{
			System.out.println("Values: "+al5.get(i));
		}

		System.out.println("-----------------------------------");
		
		// to found out commom part of arraylist
		
		ArrayList<String> al7 = new ArrayList<String>();

		al7.add("Sunil");
		al7.add("Kumawat");


		ArrayList<String> al8 = new ArrayList<String>();

		al8.add("Suneel");
		al8.add("Kumawat");
		
		al7.retainAll(al8);
		
		for(int i=0 ;i < al7.size() ; i++)
		{
			System.out.println("Values: "+al7.get(i));
		}
		
		
		






	}

}
