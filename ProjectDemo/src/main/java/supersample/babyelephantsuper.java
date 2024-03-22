/*example for usage 2 of super keyword - 
to invoke immediate parent class instance method*/

package supersample;

public class babyelephantsuper extends Elephantsuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		babyelephantsuper  obj=new babyelephantsuper();
		obj.print();
	}
	
	public void makesound() {
		System.out.println("meow meow");
	}
	
	public void print()
	{
		makesound();
		super.makesound();
		
	}

}
