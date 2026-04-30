package day;

import java.util.ArrayList;
import java.util.List;

public class ListExp1 {

	public static void main(String[] args) {
	 List<Integer> list = new ArrayList<Integer>(10);
	 System.out.println("lenght: "+list.size());
	 list.add(12);//0
	 list.add(10);//1
	 list.add(55);//2
	 list.add(2);//3
	 System.out.println("lenght: "+list.size());
	 list.remove(2);// always it will consider its an index
	 System.out.println("the res: "+list);
	 
	 // list.remove(55); err

	// old + (old/2)
	 
	 //10+(10/2)
	 //10+5 =>15
	}

}
