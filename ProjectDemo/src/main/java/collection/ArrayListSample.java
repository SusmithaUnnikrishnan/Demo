package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();//generic arraylist
		list1.add("ME");
		list1.add("BEING");
		list1.add("MYSELF");
		list1.add("I");
		list1.add("Want");
		list1.add("To");
		list1.add("Conquer");
		list1.remove("ME");//remove(object o) or remove(int index) both will be applicable.
		System.out.println(list1);
		System.out.println(list1.size());//to find the length
		
		ArrayList<Character> list2=new ArrayList<Character>();
		list2.add('A');
		list2.add('B');
		list2.add('C');
		System.out.println(list2);
		
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("I");
		list3.add("LOVE");
		list3.add("MYSELF");
		list3.add(null);
		list3.add(null);
		System.out.println(list3);
		
		//To remove:
		list2.remove(1);
		System.out.println(list2);
		
		//To addALL:
		list1.addAll(list3);//to add all elements of list3 to list1
		System.out.println(list1);
		
	//To removeAll:
		list1.removeAll(list3);//all common elements and elements of list3 will be removed
		System.out.println(list1);
	//To get an element from an index:
		list1.get(0);	
	//To set an element to an index:
		list1.set(0, "HOPE");
		System.out.println(list1);	
	//To sort a list
		Collections.sort(list1);
		System.out.println(list1);//will be sorted in alphabetical order. First uppercase will be shown
	//using for loop
		for(int i=0;i<list1.size();i++)
		{
		System.out.println(list1.get(i));
		}
	//using for each loop
		for(String i:list1)
		{
			System.out.println(i);
		}	
	//Non-generic ArrayList
		ArrayList l=new ArrayList();
		l.add(12);
		l.add("hai");
		l.add('a');
		System.out.println(l);
	//Iterator - To print the list
		Iterator<String> i=list1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		i.remove();	
	//Contains - to check the presence of an element
		System.out.println(list1.contains("To"));
}
}
