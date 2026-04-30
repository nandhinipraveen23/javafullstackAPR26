package day;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExp12 {

	public static void main(String[] args) {
		 
	 
		 
	
	
	List<Integer> numberList = new ArrayList<>();
	numberList.add(12);//0
	numberList.add(2);//1
	numberList.add(4);//2
	numberList.add(54);//3
	
	
	
	ListIterator<Integer> itr=	numberList.listIterator();
		 while(itr.hasNext())
		 {
				 System.out.println("the data is: "+itr.next());
		 }
	 
	System.out.println("========================================");
	
	 
	while(itr.hasPrevious())
	{
		System.out.println("pre : "+itr.previous());
	}

	 
	
		 
		 

	}

}
