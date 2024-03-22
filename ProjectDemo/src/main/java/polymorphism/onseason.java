
package polymorphism;

import java.util.Scanner;

public class onseason {
	
	double onseasoncost;
	int cost;
	String seasontype;
	
	public void print() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the cost:");
		cost=input.nextInt();
		System.out.println("Enter the season type");
		seasontype=input.next();
	}
	
	
	public void discount() {
	 onseasoncost=cost-(0.4*cost);
	}
	
}



