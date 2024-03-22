/*example for usage 1 of super keyword - 
to refer immediate parent class instance variable*/

package supersample;

public class Elephantsuper extends Animalsuper {

	String sound="aaaahhhh";

	public static void main(String args[]) {
		Elephantsuper obj=new Elephantsuper();
		obj.makesound();
		obj.print();
	}
	
	public void makesound() {
		System.out.println("aah ahh ahh");
	}
	
	public void print()
	{
		System.out.println(super.sound);
		System.out.println(sound);
	}
	
}

