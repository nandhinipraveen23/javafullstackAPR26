package day;

import java.util.ArrayList;
import java.util.List;

public class ListExp6 {

	public static void main(String[] args) {
		 List <Object> list = new ArrayList<>(10);
		 System.out.println("lenght: "+list.size());
		 list.add(12);//0
		 list.add(10);//1
		 list.add(55);//2
		 list.add(2354); //3
		 list.add(55);//4
		 
		 
		int ans=(int) list.get(2) ;// it will fetch the data from the given index
	 
		System.out.println("the res is: "+ans);
		 
		 
		 System.out.println("the res: "+list);
		 
		 

	}

}
