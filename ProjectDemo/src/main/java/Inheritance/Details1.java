package Inheritance;
import java.util.Scanner;

public class Details1 {
	 int basicPay;
	 int deduction;
	 int bonus;
	
	public void info() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your Basic pay :");
		basicPay=input.nextInt();
		System.out.println("Enter Deduction:");
		deduction=input.nextInt();
		System.out.println("Enter Bonus:");
		bonus=input.nextInt();
		
	}
}
