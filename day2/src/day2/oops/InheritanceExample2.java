package day2.oops;
class Parent1
{
	 void display()
	 {
		 System.out.println("im from parent");
	 }
}
class Child1 extends Parent1
{
	void show()
	 {
		 System.out.println("im from child 1");
	 }
}
class Child2 extends Parent1
{
	void sing()
	 {
		 System.out.println("im from child2 i can sing");
	 }
}

public class InheritanceExample2 {

	public static void main(String[] args) {
		 Child1 c1 = new Child1();
		 Child2  c2 = new Child2();
		 c1.display();
		 c2.display();

	}

}
