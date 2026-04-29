package day3;


interface Animal
{
	public abstract void makeSound();
	default void sleep() {
		System.out.println("all the animals will sleep");
	}
	public static void show() {
		System.out.println("hai im from the interface");
	}
}

class Dog implements Animal{

	  public void sleep()
	{
		System.out.println("all the animals will not sleep");
		
	}
	@Override
	public void makeSound() {
		System.out.println("wowowo");
	}
	
	public static void show() {
		System.out.println("hai im from the dog class");
	}
	
}
public class Interfacaewith8feature {

	public static void main(String[] args) {

		Animal d= new Dog();
		d.makeSound();
		d.sleep();
		Animal.show();
		
		
		 
		 
	}

}
