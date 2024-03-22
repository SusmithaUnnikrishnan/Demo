package aggregation;//global aggregation

public class Student {
	String name;
	int rollno;
	Address a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address obj=new Address("Susmitham",10,678631,"Kongad");
		Student obj1=new Student("Susmitha",54,obj);
		obj1.display();

	}
	
	public Student(String name, int rollno, Address a)
	{
		this.name=name;
		this.rollno=rollno;
		this.a=a;
	}
	
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll No:"+rollno);
		System.out.println("Housename:"+a.housename);
		System.out.println("House Number:"+a.housenumber);
		System.out.println("Pincode:"+a.pincode);
		System.out.println("City:"+a.city);
	}

}
