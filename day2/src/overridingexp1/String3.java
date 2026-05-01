package overridingexp1;
 
public class String3 {

	public static void main(String[] args) {
		
	 Stu s1= new Stu();
	 
	 String s2 = new String ("harika");//1000
	 String s3 = new String ("harika");//2000
	 String s4=s2;//1000
	 String s5="harika";//100
	 System.out.println(s2.equals(s5));//t
	 System.out.println(s4.equals(s2));//true
	 System.out.println(s4.equals(s3));//t
	 System.out.println(s5.equals(s4));//t
	 
	  
	}

}
