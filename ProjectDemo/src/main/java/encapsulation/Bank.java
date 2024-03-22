package encapsulation;

public class Bank {

	private int pin;
	
	
	public void setter(int pin)
	{
		this.pin=pin;
	}
	
	public void getter()
	{
		System.out.println("Pin number is:"+pin);
	}
	
	public void valid()
	{
		if(pin==1001||pin==1234||pin==1212)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}
