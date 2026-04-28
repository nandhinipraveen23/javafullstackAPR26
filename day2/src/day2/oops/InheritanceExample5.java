package day2.oops;

interface Dad
{
	
	void saySomthing();
}
interface Mom
{
	void saySomthing();
}
class ChildDemo implements Dad,Mom
{

	@Override
	public void saySomthing() {
		System.out.println("hi imfrom demo");
		
	}

 
//	public void saySomthing1() {
//		System.out.println("hi imfrom demo");
//		
//	}
//
//	 
//	public void saySomthing() {
//		System.out.println("hi im ALSO from  demo");
//		
//	}
	
}
public class InheritanceExample5 {

	public static void main(String[] args) {
		ChildDemo cd = new ChildDemo();
		cd.saySomthing();

	}

}
