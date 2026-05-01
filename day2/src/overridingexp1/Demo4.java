package overridingexp1;
class Stu{
	int reg;
	String name;
}
class Employees{
private	int regNo;// instance
private	String name;
	
	public Employees()
	{
		
	}
	
	public Employees(int regNo, String name) {
		 // this keyword denotes the current object
		//regNo=r // this.regNo=r// e1.regNo=34
		this. regNo = regNo;
		//e1.regNo=9
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
	 public boolean equals(Object obj) 
	 {
		 if(this == obj) return true;
		  if (obj instanceof Employees)
		  {
			  	Employees r=(Employees) obj;
			  	if(this.regNo==r.regNo && this.name.equals(r.name))
			  	{
			  		return true;
			  	}
			  	else
			  		return false;
		  
		  }
		  else
			  return false;
	 }
}

public class Demo4 {

	public static void main(String[] args) {
		
		 Stu s1= new Stu();
		 s1.reg=9;
		 s1.name="Harika";
		 
		 Employees e1 = new Employees(9,"Harika"); // 100
			Employees e2 = new Employees(10,"Rajesh"); //200
			Employees e3 = new Employees(9,"Harika"); //300
			Employees e4=e1;// e4 started pointing to e1 => 100
			
		 System.out.println(e1.equals(e2));//f
		 System.out.println(e1.equals(e3));//t
		 System.out.println(e4.equals(e3));//t
		 System.out.println(e4.equals(e1));//t
		 System.out.println(e1.equals(null));//f
		  System.out.println(e1.equals(s1));//f
 

	}

}
