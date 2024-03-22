package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Green");
		list1.add("White");
		list1.add("Red");
		System.out.println(list1);
		
		list1.get(0);
		
		Iterator<String> i=list1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		list1.remove(2);
		
		System.out.println(list1.contains("White"));
	}

}
