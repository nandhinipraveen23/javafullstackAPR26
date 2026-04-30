package day;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExp9 {

	public static void main(String[] args) {
		 List <String> list = new ArrayList<>(10);
		 System.out.println("lenght: "+list.size());
		 list.add("haritha");//0
		 list.add("rasheed");//1
		 list.add("rajesh");//2
		 list.add("praveen"); //3
		 
		 System.out.println("the res: "+list); 
		 
	String s1= "nandhini";
	System.out.println(s1.equals("nandhini"));// both elements are equal or not
	
	
 for( String s  : list )
 {
	 if(s.equals("rajesh"))
	 {
		 list.remove(s);
	 }
	 else
		 System.out.println("not equal: "+s);
	// System.out.println(s);
 }
	
	List<Integer> numberList = new ArrayList<Integer>();
	numberList.add(12);//0
	numberList.add(2);//1
	numberList.add(4);//2
	numberList.add(54);//3
	
	for( int s  : numberList )
	 {
		 if(s==2)
		 {
			 numberList.remove(s);//2
		 }
		 else
			 System.out.println("not equal: "+s);
		// System.out.println(s);
	 }
 System.out.println(numberList);
	 
	
		 
		 

	}

}
