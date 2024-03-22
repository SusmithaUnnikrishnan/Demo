package Inheritance;

public class Details3 extends Details2 {
	double totalSalary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details3 obj=new Details3();
		obj.info();
		obj.info1();
		obj.info2();
	}
	
	public void total() {
		totalSalary=basicPay+hra-pf-deduction+bonus;	
	}
	
	public void info2() {
		this.total();	
		System.out.println("SALARY SLIP:");
		System.out.println("Basic pay :"+basicPay);
		System.out.println("Deduction :"+deduction);
		System.out.println("Bonus :"+bonus);
		System.out.println("hra :"+hra);
		System.out.println("pf :"+pf);		
		
		System.out.println("Total salary by hand :"+totalSalary);
	}
}
