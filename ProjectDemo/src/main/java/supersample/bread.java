/*example for usage 3 of super keyword - 
to invoke immediate parent class constructor*/
package supersample;

public class bread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	bread()
	{
		System.out.println("bread and jam");
	}
	
	bread(String butter)
	{
		this();
		System.out.println(butter);
	}
	
	}
