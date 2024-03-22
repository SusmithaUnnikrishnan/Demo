package Basicprograms;
import java.util.Scanner;
public class Bank {
	static long balance=1000;
	static long amt; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("WELCOME!");
        System.out.println();
        int option=0;
        do {
        	System.out.println("\n1. Deposit the amount \n2. Withdraw the amount \n3. Check account balance \n4. Exit");
            System.out.println();
            System.out.println("Enter your option:");
            option=input.nextInt();
            System.out.println();
            switch(option)
            {
            case 1:
            	System.out.println("DEPOSIT");
            	System.out.println();
            	deposit();
            	break;
            case 2:
            	System.out.println("WITHDRAWAL");
            	System.out.println();
            	withdrawal();
            	break;
            case 3:
            	System.out.println("BALANCE CHECK");
            	System.out.println();
            	BalanceCheck();
            	break;
            case 4:
            	//System.out.println("EXIT");
            	System.exit(0);//inorder to exit 
            }
        }
        while(option<4);
	}

    public static void deposit() {  
    	Scanner input=new Scanner(System.in);
    	System.out.println("Enter the amount you want to deposit: ");  
        amt = input.nextLong();
        balance = balance + amt;  
        System.out.println("The current balance is "+balance);
    }  
    
    public static void withdrawal() {   
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw: ");  
        amt =input.nextLong();  
        if (balance >= amt) 
        {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } 
        else {  
            System.out.println("Your account have insufficient balance" );  
        }  
    }  
    
    public static void BalanceCheck()
    {
    	System.out.println("The available balance in your account is"+balance);
    }
   
}
