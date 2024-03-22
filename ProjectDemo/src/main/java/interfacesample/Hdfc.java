package interfacesample;
import java.util.Scanner;

public class Hdfc implements RBI{
	int d;
	long a;
	double finalAmount;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Hdfc obj=new Hdfc();
		obj.recurringDeposit();
		obj.calculate();
	}
	
	public void recurringDeposit()
	{
	
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the amount to be deposited");
		a=input.nextLong();
		System.out.println("Enter the duration in months");
		d=input.nextInt();
		System.out.println();
		System.out.println("The deposited amount is"+" "+a);
		System.out.println("The duration is"+" "+d+" "+"Months");
	}
	public void calculate() {
	
		System.out.println("The interest rate is"+" "+INTEREST_RATE+"%");
		
		finalAmount=(a*d)+(a*((d*(d+1))/2)*(INTEREST_RATE/100)*(1/12));
		
		System.out.println("The amount rewarded after"+" "+d+" "+"months"+" "+"will be"+" "+finalAmount);
	}
}
