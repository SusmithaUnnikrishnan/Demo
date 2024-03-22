package exception;//custom exception

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
					validate(15);
				} catch (LicenseException e) {
					e.printStackTrace();//or we can give Sysout(e);
				}
	}
	
	public static void validate(int age) throws LicenseException
	{
		if(age<18) {
			throw new LicenseException("Not eligible");
		}
		else
		{
			System.out.println("License approved");
		}
	}

}
