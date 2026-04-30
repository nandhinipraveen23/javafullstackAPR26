package day;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExp11 {

	public static void main(String[] args) {
		 
	 
		 
	
	
	List<Integer> numberList = new ArrayList<>();
	numberList.add(12);//0
	numberList.add(2);//1
	numberList.add(4);//2
	numberList.add(54);//3
	
 Iterator<Integer> itr=	numberList.iterator();
	 while(itr.hasNext())
	 {
		 Integer ele=  itr.next();  
		 if(ele.equals(2))
		 {
			 itr.remove();
		 }
		 else
			 System.out.println("the data is: "+ele);
	 }
 System.out.println(numberList);
	 
	
		 
		 

	}

}
