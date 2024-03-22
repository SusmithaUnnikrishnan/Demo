package exception;

public class TrySample {

	public static void main(String args[])
	{
		int a=10;
		int b=20;
		//try keyword is used for exception handling
		try {
			int result=50/0;
		}
		catch(ArithmeticException e)//try block must be followed by catch or finally
		{
			System.out.println(e);	//e is given to get the exception or else if we want to print anything else, we can give that inside sysout
		}
		System.out.println("Rest of the code");	
	}
}
