package day2.oops;

class GParent
{
	void display()
	{
		System.out.println("im from GP");
	}
}
class  Parent extends GParent
{
	void show()
	{
		System.out.println("im from parent");
	}
}

class Child extends Parent
{
	void play()
	{
		System.out.println("im play");
	}
}


public class InheritanceExample {

	public static void main(String[] args) {
		Child c = new Child();
		c.display();
		c.play();
		c.show();
	}

}
