package Inheritance;//Example for Single inheritance

public class Dog extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Dog obj=new Dog();
	System.out.println(obj.color);
	obj.eat();
	obj.sound();
	obj.bark();
	}
	
	public void bark() {
		System.out.println("Barking");
	}

}

