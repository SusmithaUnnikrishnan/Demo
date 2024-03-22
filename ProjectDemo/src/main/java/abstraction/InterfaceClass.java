package abstraction;//Using Interface

public class InterfaceClass implements SampleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleInterface obj=new InterfaceClass();
		obj.show();
	}
		public void show()
		{
			System.out.println("Max value is"+MAX_VALUE);
			System.out.println("Implementation of abstarction method");
		}
		
}
