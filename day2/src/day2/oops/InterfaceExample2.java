package day2.oops;

interface RBI
{
	void interestRate();
 
}

class Icici implements RBI {

	@Override
	public void interestRate() {
		System.out.println("12%");
		
	}
	void display()
	{
		System.out.println("im from ICICI");
	}
	
}

class Sbi implements RBI {

	@Override
	public void interestRate() {
		System.out.println("4%");
		
	}
	
}

public class InterfaceExample2 {

	public static void main(String[] args) {

		RBI i = new Icici();
		RBI s = new Sbi();
		i.interestRate();
		s.interestRate();
		
		
// Icici i1 = new Icici();
// i1.display();
// i1.interestRate();
//Sbi s = new Sbi();
//i.interestRate();
//s.interestRate();

	}

}
