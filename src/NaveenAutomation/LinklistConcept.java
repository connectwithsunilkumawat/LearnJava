package NaveenAutomation;

import java.util.Iterator;
import java.util.LinkedList;

import kotlin.collections.builders.MapBuilder.Itr;

public class LinklistConcept {

	public static void main(String[] args) {

		LinkedList<String> li = new LinkedList<String>();
		li.add("Sunil");
		li.add("Kumawat");
		li.add("Samartha");
		li.add("Samar");

		System.out.println(li);

		li.addFirst("Man");
		System.out.println(li);

		li.addLast("Man");
		System.out.println(li);

		System.out.println(li.get(2));
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		
		li.set(2, "I-Phone");
		System.out.println(li);
		
		li.removeFirst();
		li.removeLast();
		li.remove(1);
		System.out.println(li);
		
		//li.remove();
		//System.out.println(li);
		//itration
		
		
		for(int i = 0 ; i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		System.out.println("------------");

		for(String value : li)
		{
			System.out.println(value);
		}
		System.out.println("------------");
		
		  Iterator<String> itr = li.iterator();
		  while(itr.hasNext())
		  {
			  String value = itr.next();
			  System.out.println(value);
		  }
		  
		  System.out.println("------------");
		  
		  int num = 0;
		  while(li.size() < 0)
		  {
			  li.get(num);
			  num++;
		  }
		  
		  
		  
	}

}
