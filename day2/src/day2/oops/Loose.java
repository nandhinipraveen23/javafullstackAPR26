package day2.oops;

interface Worker{
	public abstract void doWork();
}
class Nandhini1{
	
	Worker w;
	
	Nandhini1 (Worker w){
		this.w=w;
	}
	
	void check()
	{
		w.doWork();
	}
	
}

class Harika1 implements Worker{
	public void doWork()
	{
		System.out.println("im harika yes im working");
	}
}
class Rajesh1 implements Worker
{
	public void doWork()
	{
		System.out.println("im rajesh yes im working");
	}
}
class Rasheed1 implements Worker{
	public void doWork()
	{
		System.out.println("im rasheed yes im working");
	}
}

class Revathi1 implements Worker{
	public void doWork()
	{
		System.out.println("im reavthi yes im working");
	}
}
public class Loose {

	public static void main(String[] args) {
		Harika1 h = new Harika1();
		Rajesh1 raj=new Rajesh1();
		Rasheed1 ras= new Rasheed1();
		 Revathi1 r1 = new Revathi1();
		 
		Nandhini1 n = new Nandhini1(h);
		n.check();
		
		Nandhini1 n1 = new Nandhini1(raj);
		n1.check();
		
		Nandhini1 n2 = new Nandhini1(ras);
		n2.check();
		
		
		Nandhini1 n3 = new Nandhini1(r1);
		n3.check();
		
		

	}

}
