package day;

import java.util.ArrayList;
import java.util.List;

public class ListExp2 {

	public static void main(String[] args) {
		 List <Object> list = new ArrayList<>(10);
		 System.out.println("lenght: "+list.size());
		 list.add(12);//0
		 list.add(10);//1
		 list.add(55);//2
		 list.add("hai");//2
		 list.add("2");//3
		 list.add(3.4);//4
		 list.add(true);//5
		 list.add(2);//6
		 list.add(3.4F);//7
		 list.add(55);//8
		 System.out.println("lenght: "+list.size());
		 //list.remove(2);
		 //list.remove(3.4);
		  //list.remove(3.4f);
		//  list.remove(10);
		 list.remove("2");
		 System.out.println("the res: "+list);
		 
		 

	}

}
