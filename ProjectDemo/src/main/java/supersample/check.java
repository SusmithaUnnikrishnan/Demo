package supersample;

public class check extends Addition {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check obj=new check();
		obj.divisible();
	}
	
	public void divisible() {
		super.sum(2,10);

		if(total%10==0)
		{
			System.out.println("The sum of given numbers is divisible by 10");
		}
		else
		{
			System.out.println("The sum of given numbers is not divisible by 10");
		}
		
	}

}
