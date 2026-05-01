package overridingexp1;
 
public class String2 {

	public static void main(String[] args) {
		
	 
	 String s2 = new String ("harika");//1000
	 String s3 = new String ("harika");//2000
	 String s4=s2;//1000
	 String s5="harika";//100
	 System.out.println(s2==s3);//false
	 System.out.println(s4==s2);//true
	 System.out.println(s4==s3);//false
	 System.out.println(s5==s4);//false
	 
	  
	}

}
