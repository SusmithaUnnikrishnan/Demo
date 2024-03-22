package exception;

public class ThrowSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sum(50,20);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block");
	
		}
	}
	
	public static void sum(int a,int b)
	{
		int s=a+b;
		if(s>50)
		{
			throw new ArithmeticException("Sum is greater than 50");
			
		}
		else
		{
			System.out.println("Sum is less than 50");
		}
	}

}
