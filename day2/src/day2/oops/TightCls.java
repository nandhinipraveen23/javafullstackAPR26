package day2.oops;
class Nandhini{
	Harika h;
	Rajesh raj;
	Rasheed ras;
	Revathi r;
	Nandhini (Harika h,Rajesh raj,Rasheed ras,Revathi r)
	{
		this.h=h;
		this.raj=raj;
		this.ras=ras;
		this.r= r;
	}
	
	void check()
	{
		h.doWork();
		raj.doWork();
		ras.doWork();
		r.doWork();
	}
	
}
class Harika{
	void doWork()
	{
		System.out.println("im harika yes im working");
	}
}
class Rajesh
{
	void doWork()
	{
		System.out.println("im rajesh yes im working");
	}
}
class Rasheed{
	void doWork()
	{
		System.out.println("im rasheed yes im working");
	}
}
class Revathi{
	void doWork()
	{
		System.out.println("im reavthi yes im working");
	}
}
public class TightCls {

	public static void main(String[] args) {
		Harika h = new Harika();
		Rajesh raj=new Rajesh();
		Rasheed ras= new Rasheed();
		Revathi r = new Revathi();
		Nandhini n = new Nandhini(h, raj, ras,r);
		n.check();
	}

}
