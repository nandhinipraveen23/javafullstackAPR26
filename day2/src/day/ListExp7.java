package day;

import java.util.ArrayList;
import java.util.List;

public class ListExp7 {

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
		 
		 
		int index= list.indexOf(10);
		int index1= list.indexOf(55);
		int index2=list.lastIndexOf(55);
	 
		System.out.println("the index is: "+index);
		System.out.println("the index is: "+index1);
		System.out.println("the index is: "+index2);
		 
		 System.out.println("the res: "+list);
		 
		 

	}

}
