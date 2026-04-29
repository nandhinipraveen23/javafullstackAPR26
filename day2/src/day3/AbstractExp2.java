package day3;

abstract class Dad
{
	
	public abstract void saySomthing();
}

abstract class Mom
{
	public abstract void saySomthing();
}
class ChildDemo // can't extends multiple classes this is the limitations
{

//	@Override
//	public void saySomthing() {
//		System.out.println("hi imfrom demo");
//		
//	}

 
	public void saySomthing1() {
		System.out.println("hi imfrom demo");
		
	}

	 
	public void saySomthing() {
		System.out.println("hi im ALSO from  demo");
		
	}
	
}
public class AbstractExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
