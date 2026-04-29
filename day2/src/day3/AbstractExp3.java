package day3;
 
abstract class Animall{
	public abstract void makeSound();
}
class Dogg extends Animall{

	@Override
	public void makeSound() {
		System.out.println("wowowwww");
		
	}
}
class Cat extends Animall{
	@Override
	public void makeSound() {
		System.out.println("mewwww");
		
	}
}
public class AbstractExp3 {

	public static void main(String[] args) {
		 Animall d = new Dogg();
		 Animall c = new Cat();
		 
		 d.makeSound();
		 c.makeSound();

	}

}
