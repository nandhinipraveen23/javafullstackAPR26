package overridingexp1;

class Employeee{
	int regNo;// instance
	String name;
	
	public Employeee()
	{
		
	}
	
	public Employeee(int regNo, String name) {
		 
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

public class Demo3 {

	public static void main(String[] args) {
		Employeee e1 = new Employeee(9,"Harika"); // 100
		Employeee e2 = new Employeee(10,"Rajesh"); //200
		Employeee e3 = new Employeee(9,"Harika"); //300
		Employeee e4=e1;// e4 started pointing to e1 => 100
		//== is the operator it will check both instance are same or not
		//parent class equals() always will check  both instance are same or not
		 System.out.println(e1.equals(e2));//f
		 System.out.println(e1.equals(e3));//f
		 System.out.println(e4.equals(e3));//f
		 System.out.println(e4.equals(e1));//t
 

	}

}
