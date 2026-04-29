package day3;

 

abstract class Sample
{
	public abstract void display();
	 
}
class Test extends Sample {
	 
	public void display() {
		System.out.println("hai im from test class updated"); 
		
	}
}

public class AbstractExp1 {

	public static void main(String[] args) {
		 Sample s = new Test();
		 s.display();

	}

}
