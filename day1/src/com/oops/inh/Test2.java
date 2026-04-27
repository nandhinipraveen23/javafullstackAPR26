package com.oops.inh;
class MyParent
{
	void display()
	{
		System.out.println("im from parent display");
	}
	void eat()
	{
		System.out.println("im using righthand");
	}
	
	  void sing() 
	{
		System.out.println("i can sing");
	}
}
class MyChild extends MyParent{
	void play()
	{
		System.out.println("im playing");
		 
	}
	
	void eat()// overriding
	{
		System.out.println("im using lefthand");
	}
	 
}
public class Test2 {

	public static void main(String[] args) {
 
//MyChild mc = new MyChild();
//mc.display();
//mc.sing();
//mc.eat();
//mc.play();
//		int b=10;
//long a = b; 
MyParent mc = new MyChild();
// it will bring only the parent methods and overrided method
// it won't show the child class methods
mc.display();
mc.sing();
mc.eat();
 
	}

}
