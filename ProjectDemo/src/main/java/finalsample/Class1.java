package finalsample;

public class Class1 extends Class3{ //cannot extend class3 if final keyword is used in class3 
	final int a=20;
	final int b; //blank final variable 

	
	Class1()
	{
		b=10;
		//a=5; cannot give another value for a since it is initialized as 20 by using final keyword
	}
	
	public final void display()
	{
		System.out.println("FINAL KEYWORD");
	}
}
