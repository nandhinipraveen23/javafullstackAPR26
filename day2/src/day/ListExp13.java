package day;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExp13 {

	public static void main(String[] args) {
		 
	List<Integer> numberList = new ArrayList<>();
	numberList.add(12);//0
	numberList.add(2);//1
	numberList.add(4);//2
	numberList.add(54);//3
	
	
	List<Integer> numberList1 = new ArrayList<>();
	numberList1.add(12);//0
	numberList1.add(2);//1
	numberList1.add(4);//2
	numberList1.add(54);//3
	numberList1.add(545);//4
	
	List<Integer> numberList2 = new ArrayList<>();
	numberList2.add(2);//0
	numberList2.add(12);//1
	numberList2.add(54);//2
	numberList2.add(4);//3
	
	boolean ans =numberList.equals(numberList1);
	System.out.println("nl and nL1: it will check the count also the element's position "+ans);
	
	
	boolean ans1 =numberList.equals(numberList2);
	System.out.println("nL and num2: "+ans1);
	
	
	
	 
	 
	
		 
		 

	}

}
