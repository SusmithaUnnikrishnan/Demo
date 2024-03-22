package collection;
import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList();
		list1.add("apple");
		list1.add("orange");
		list1.add("grapes");
		System.out.println(list1);
		System.out.println(list1.size());//to find the length
		wrapper();
		
	}
	
	public static void wrapper()
	{
		List<Integer> list1=new ArrayList();//Here wrapper class for int is used i.e, Integer
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.remove(0);//In wrapper class remove(object o) will only be working
		System.out.println(list1);
		
		}
	}
