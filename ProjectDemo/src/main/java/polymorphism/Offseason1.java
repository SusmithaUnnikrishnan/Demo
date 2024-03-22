package polymorphism;

public class Offseason1 extends Onseason1 {

double offseasoncost;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onseason1 obj=new Offseason1();
		Offseason1 obj1=new Offseason1();
		obj1.discount();
		obj1.print();
		}
	
	public void discount() {
		super.discount();
		offseasoncost=cost-(0.15*cost);
	}
	
	public void print() {
		
			System.out.println("The actual amount is:"+cost);
			
			System.out.println("The ONSEASON amount after 40% discount is:"+onseasoncost);
			
			System.out.println("The OFFSEASON amount after 15% discount is:"+offseasoncost);	
		}	
}
