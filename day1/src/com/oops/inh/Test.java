package com.oops.inh;

class Teacher{
	public Teacher()
	{
		System.out.println("im from the teacher");
	}
}
class Student extends Teacher
{
	 	Student ()
	 	{ 
	 		super();
	 		System.out.println("im from the student");
	 		
	 	}
}
public class Test {

	public static void main(String[] args) {
		
		
		Student s = new Student();
		
	}

}
