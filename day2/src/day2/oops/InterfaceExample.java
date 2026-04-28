package day2.oops;
interface Animal{
	void makeSound();
}
class Dog implements Animal{

	@Override
	public void makeSound() {
		System.out.println("wowowwww");
		
	}
}
class Cat implements Animal{
	@Override
	public void makeSound() {
		System.out.println("mewwww");
		
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		c.makeSound();
		d.makeSound();
	}

}
