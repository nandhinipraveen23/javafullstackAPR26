package com.oops.inh;
class MyParent1
{
	void display()
	{
		System.out.println("im from parent display");
	}
	static  void eat()
	{
		System.out.println("im using righthand");
	}
	
	 
}
class MyChild1 extends MyParent1{
	void play()
	{
		System.out.println("im playing");
		 
	}
	
	static void eat()// overriding
	{
		System.out.println("im using lefthand");
	}
	
	 
}
public class Test3 {

	public static void main(String[] args) {
 
 
//		MyChild1 mc = new MyChild1();
// 
//mc.display();
//mc.eat();
//mc.play();
		
		MyParent1 mc = new MyChild1();
		 
		mc.display();
		mc.eat();
		
	}

}
