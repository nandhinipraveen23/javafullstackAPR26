package day;

import java.util.ArrayList;
import java.util.List;

public class ListExp3 {

	public static void main(String[] args) {
		 List <Object> list = new ArrayList<>(10);
		 System.out.println("lenght: "+list.size());
		 list.add(12);//0
		 list.add(10);//1
		 list.add(55);//2
		 list.add(1,"nandhini");// 1st arg is an index, 2nd arg data
		 
		 
		 System.out.println("the res: "+list);
		 
		 

	}

}
