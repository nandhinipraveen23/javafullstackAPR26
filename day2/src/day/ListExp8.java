package day;

import java.util.ArrayList;
import java.util.List;

public class ListExp8 {

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
		 
		 for(int i=0;i<list.size();i++)
		 {
			 System.out.println(list.get(i));
		 }
		 System.out.println("rev order");
		 for(int i=list.size()-1;i>=0;i--)
		 {
			 System.out.println("index: "+i+" "+list.get(i));
		 }
		 System.out.println("another loop");
		 for(Object t : list)//10,12,55,3......
		 {
			 System.out.println(t);
		 }
	 
	
		 
		 

	}

}
