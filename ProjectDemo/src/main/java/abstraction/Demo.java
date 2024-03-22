package abstraction;//Using abstract class

public class Demo extends Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj=new Demo();
		obj.display();
		obj.show();
		obj.print();
	}
	
	public void print()
	{
		System.out.println("Implementation of abstract method");
	}
	
	public void show() 
	{
		System.out.println("Showing details");
	}

}
