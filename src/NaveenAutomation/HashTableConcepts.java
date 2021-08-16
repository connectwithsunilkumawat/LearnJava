package NaveenAutomation;

import java.util.Hashtable;

public class HashTableConcepts {

	public static void main(String[] args) 
	{
	
		Hashtable h = new Hashtable();           // Hashtable <Object , Object> h = new Hashtable<Object , Object>();
		h.put("Name", "Sunil");
		h.put("Name", "Samarth");                // value will get override when we have same key
		
		System.out.println(h.size());           // size will be 1 only due to same key valye
		System.out.println(h.get("Name"));      // Samarth
		
		h.put(1, "Suni");
		h.put("S.No", 100);
		
		System.out.println(h.size());           
		System.out.println(h.get("S.No"));
		
		
		Hashtable<Integer,String> h1 = new Hashtable<Integer,String>();
		h1.put(101, "Java");
		h1.put(102, "Selenium");
		h1.put(103, "Rest Assured");
		
		System.out.println(h1.size());           
		System.out.println(h1.get(101));
		
		Hashtable<Integer,Integer> h2 = new Hashtable<Integer,Integer>();
		
		h2.put(101, 1001);
		h2.put(102, 1002);
		h2.put(103, 1003);
		
		System.out.println(h2.size());           
		System.out.println(h2.get(101));
		
		
		
		
		
		
		
		
	}

}
