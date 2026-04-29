package day3;


abstract class Payment{
	String data="hai";
	
	final int MAX=100;
	public Payment() {
		System.out.println("im from parent");
	}
	public Payment(String data) {
		 this.data=data;
	}
	abstract void pay(int amount);
	
	void printName()
	{
		System.out.println("My name is: "+data);
	}
}
class GPay extends Payment{
	
	GPay()
	{
		 
		 System.out.println("my data is: "+data);
	}
	GPay(String name)
	{ 
	super(name);	
	}

	@Override
	void pay(int amount) {

		if(amount > MAX)
		{
			  //MAX=1001;// limitations
		System.out.println("the amount exceeds: "+amount);
		}
		
		else if(amount < MAX)
		{
		System.out.println("the amount below min: "+amount);
		}
		else
		System.out.println("payment success");
		
	 
	}
	
	
}
public class AbstractClassWithVariables {

	public static void main(String[] args) {
	 Payment p = new GPay();
  Payment g = new GPay("Nandhini");
System.out.println(g.data);

g.pay(200);
g.printName();
  }

}
