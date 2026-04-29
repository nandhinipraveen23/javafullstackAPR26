package day3;

 

abstract class Demo
{
	 public abstract void sing();
	void display()
	{
		System.out.println("abstract class allows the normal method");
	}
	
	void doWork()
	{
		System.out.println("yes i do");
	}
	 
}
class MyClass extends Demo {
	 
	public void show() {
		System.out.println("hai im from MyClass "); 
		
	}
	
	 
	public void doWork()
	{
		System.out.println("No i cant do");
	}


	@Override
	public void sing() {
		System.out.println("i can sing");
	}
}

public class AbstractExp4 {

	public static void main(String[] args) {
		 Demo d = new  MyClass();
		 d.display();
		 d.doWork();
		 d.sing();
	}

}
