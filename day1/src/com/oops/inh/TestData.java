package com.oops.inh;


class Parent
{
	void display()
	{
		System.out.println("im from parent display");
	}
	void eat()
	{
		System.out.println("im using righthand");
	}
	
	final void sing()// final
	{
		System.out.println("i can sing");
	}
}
class Child extends Parent{
	void play()
	{
		System.out.println("im playing");
		 
	}
	
	void eat()// overriding
	{
		System.out.println("im using lefthand");
	}
	 
}
public class TestData {

	public static void main(String[] args) {
		  
		Child c = new Child();
		c.display();
		c.eat();
		c.play();
		c.sing();
	}

}
