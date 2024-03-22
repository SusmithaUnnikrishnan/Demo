package exception;//unchecked exception

public class ThrowsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}
	
	public static void check() throws ArithmeticException
	{
		throw new ArithmeticException("Exception occured");
	}

}
