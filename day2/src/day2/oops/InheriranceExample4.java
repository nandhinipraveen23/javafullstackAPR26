package day2.oops;

interface Sample
{
	void display();
	 
}
class Test implements Sample {
	 
	public void display() {
		System.out.println("hai im from test class"); 
		
	}
}

public class InheriranceExample4 {
	public static void main(String[] args) {
	 
		Test t1 = new Test();
		t1.display();
	}
}
