package com.oops.inh;

class Parent2{
	
	String name;
	int height;
	public Parent2(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Parent2 [name=" + name + ", height=" + height + "]";
	}
	
	
}

class Child2 extends Parent2 {
	   String color;
	public Child2(String name, int height,String color) {
		 
		 super(name,height);
		 this.color=color;
	}
	public String toString()
	{
		return name+" "+height+" "+color;
	}
}
public class Test4 {

	public static void main(String[] args) {
		Child2 c1 = new Child2("devi", 6,"black");
		 
System.out.println(c1); 
	}

}
