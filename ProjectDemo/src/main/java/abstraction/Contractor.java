package abstraction;

public class Contractor extends Employee{
	
	public void calculateSalary() {
		int Salary=paymentPerHour*workingHours;
		System.out.println("Salary for contractor is "+Salary);
	}

}
