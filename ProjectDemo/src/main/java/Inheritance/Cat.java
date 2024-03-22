package Inheritance;//Hierarchichal Inheritance

public class Cat extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj=new Cat();
		obj.meow();
		obj.sound();
		
		

	}
	
	public void meow()
	{
		System.out.println("Meow..");
	}
	

}
