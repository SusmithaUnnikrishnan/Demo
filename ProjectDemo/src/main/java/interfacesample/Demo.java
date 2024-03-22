package interfacesample;//Multiple inheritance

public class Demo implements Interface1,Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj=new Demo();
		obj.print();
		obj.display();
		
	}
	public void print()
	{
		System.out.println(A);
		System.out.println(B);
		System.out.println("Implementation of Interface1");
	}
	public void display()
	{
		System.out.println(C);
		System.out.println("Implementation of Interface2");
	}
}
