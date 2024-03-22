package polymorphism;

public class Child extends Human{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj=new Child();
		obj.walk();//invokes the method of child class
		
		/*obj.run(); In upcasting, all the methods from parent class will be available in child class 
		 but only overridden methods of child class will be available and no other methods of child class will be available*/
		
		Child obj1=new Child();
		obj1.run();//inorder to get the method of child class, we should create an object for child class
	}
	
	public void walk() {
		super.walk();
		System.out.println("walking slow");
	}
	
	public void run()
	{
		System.out.println("Running");
	}
}
