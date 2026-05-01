package overridingexp1;

class Emp{
	int regNo;// instance
	String name;
	
	public Emp()
	{
		
	}
	
	public Emp(int regNo, String name) {
		 
		this.regNo = regNo;
		this.name = name;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	 public String toString() {
		 return "the reg No: "+ regNo+" "+"the name is: "+name;
	 }
  void display()
 {
	  
	  
	 System.out.println("the reg No: "+ regNo+" "+"the name is: "+name);
 }
	public int hashCode()
	{
		return regNo;
	}
	
}

public class Demo {

	public static void main(String[] args) {
		 Emp e1 = new Emp(9,"Harika");//9
		 Emp e2 = new Emp(10,"Rajesh");//A
		 Emp e3 = new Emp(15,"Harika");//f
		 System.out.println(e1.toString());
		 System.out.println(e2);
		 System.out.println(e3);
 

	}

}
