package day;

import java.util.ArrayList;
import java.util.List;

public class ListExp4 {

	public static void main(String[] args) {
		 List <Object> list = new ArrayList<>(10);
		 System.out.println("lenght: "+list.size());
		 list.add(12);//0
		 list.add(10);//1
		 list.add(55);//2
		 list.add(55); //3
		 list.add(23);//4
		 
		 list.clear();// make empty list
		 System.out.println("the res: and the size "+list+" "+list.size());
		 list.add("im the new data");
		 
		 System.out.println("the res: and the size "+list+" "+list.size());
		 
		 

	}

}
