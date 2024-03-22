package exception;

public class MultiCatch {

	public static void main(String args[])
	{
		try {
			
			int arr[]=new int[10];
			arr[15]=45;
			int result=50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)//multi-catch
		{
			System.out.println(e);//the first exception will be shown
		}
		catch(Exception e)//even if we didnt give specific exception,but if we give parent exception then the corresponding exception will be given
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block will always executed");
		}
	
		System.out.println("Rest of the code");
	}
}
