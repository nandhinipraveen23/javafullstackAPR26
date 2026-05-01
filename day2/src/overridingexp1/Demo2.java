package overridingexp1;

class Employee{
	int regNo;// instance
	String name;
	
	public Employee()
	{
		
	}
	
	public Employee(int regNo, String name) {
		 
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

public class Demo2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(9,"Harika"); // 100
		Employee e2 = new Employee(10,"Rajesh"); //200
		Employee e3 = new Employee(9,"Harika"); //300
		Employee e4=e1;// e4 started pointing to e1 => 100
		//== is the operator it will check both instance are same or not
		 System.out.println(e1==e2);//f
		 System.out.println(e1==e3);//f
		 System.out.println(e4==e3);//f
		 System.out.println(e4==e1);//t
 

	}

}
