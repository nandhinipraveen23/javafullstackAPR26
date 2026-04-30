package day;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExp10 {

	public static void main(String[] args) {
		 List <Object> list = new ArrayList<>(10);
		 System.out.println("lenght: "+list.size());
		 list.add(12);//0
		 list.add(10);//1
		 list.add(55);//2
		 list.add(2354); //3
		 list.add(55);//4
		 list.add(66);//5
		 list.add(45);//6
		 list.add(55);//7
		 
		 System.out.println("the res: "+list); 
		 
		 
	Iterator<Object> itr=	 list.iterator();
	//System.out.println(itr);// it won't print the data
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	 
	
		 
		 

	}

}
