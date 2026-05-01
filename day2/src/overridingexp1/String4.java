package overridingexp1;
 
public class String4 {

	public static void main(String[] args) {
		
	 
	 
	 String s2 =  "i'm harika i like to learn java fullstack" ; 
	String[] words= s2.split("[i\\s]+");
	
	System.out.println(words.length);
	
	for (String s : words)
	{
		System.out.println("the res: "+s);
	}
 
	 
	 
	  
	}

}
