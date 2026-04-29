package day3;

interface Variable
{
	public static final int MAX=100;
	void display(int amount);
	
}
class Check implements Variable{

	@Override
	public void display(int amount) {
		
		if(amount > MAX)
		{
			// MAX=1001; limitations
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
public class Interfacwwithvariables {

	public static void main(String[] args) {
		 Variable v = new Check();
		 v.display(10);

	}

}
