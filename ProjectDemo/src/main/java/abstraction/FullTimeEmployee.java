package abstraction;

public class FullTimeEmployee extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor obj1=new Contractor();
		obj1.calculateSalary();
		FullTimeEmployee obj=new FullTimeEmployee();
		obj.calculateSalary();
	}
	
	public void calculateSalary()
	{
		int Salary=paymentPerHour*8;
		System.out.println("Salary for full time employee is "+Salary);
	}

}
