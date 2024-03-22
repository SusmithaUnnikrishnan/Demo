package polymorphism;

import java.util.Scanner;

public class Offseason extends onseason{	
	
	double offseasoncost;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		onseason obj=new Offseason();
		obj.print();
	}
	
	public void discount() {
		offseasoncost=cost-(0.15*cost);
	}
	
	public void print() {
		super.print();
		super.discount();
		discount();
		check();	
	}	
	
	public void check() {
			if(seasontype.contains("onseason"))
			{
				System.out.println("The amount after 40% discount is:"+onseasoncost);
			}
			else if(seasontype.contains("offseason"))
			{
				System.out.println("The amount after 15% discount is:"+offseasoncost);
			}
			else
			{
				System.out.println("Invalid season type");
			}
		}	
}
