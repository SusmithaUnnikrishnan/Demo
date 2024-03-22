package collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetSample {
	
	public static void main(String args[])
	{
		HashSet<String> s1=new HashSet<String>();
		s1.add("APPLE");
		s1.add("Orange");
		s1.add("Grapes");
		
		HashSet<String> s2=new HashSet<String>();
		s2.add("KIWI");
		s2.add("Water melon");
		s2.add("Grapes");
		
	//iterator
		Iterator<String> i=s1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	//remove
		s1.remove("APPLE");//can only remove object not index
		System.out.println(s1);
	//addAll
		s1.addAll(s2);
		System.out.println(s1);
		System.out.println(s2);	
	//removeAll
		s1.removeAll(s2);
		System.out.println(s1);
	//size
		System.out.println(s1.size());
	//contains
		System.out.println(s2.contains("KIWI"));
	//Collections.sort, get(), set() - Not applicable	
	}
}
