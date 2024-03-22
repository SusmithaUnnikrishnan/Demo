package encapsulation;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your pin:");
		int pin=input.nextInt();
		Bank obj=new Bank();
		obj.setter(pin);//pin is given as parameter sice scanner class is used.
		obj.getter();
		obj.valid();
	}
}
