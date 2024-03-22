package encapsulation;

public class Sample {
	private String name;
	private long accountno;
	private String email;
	
	public void setter(String name, long accountno, String email)
	{
		this.name=name;
		this.accountno=accountno;
		this.email=email;
	}
	
	public void getter()
	{
		System.out.println("Name:"+name);
		System.out.println("Account Number:"+accountno);
		System.out.println("Email:"+email);
	}
}
