package collectionexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExp3 {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<Integer>();
		 
		 Scanner s = new Scanner(System.in);
		 int noOfData;
		 System.out.println("Enter how many nos u want: ");
		 noOfData = s.nextInt();//5
		 for(int i=0;i<noOfData;i++)
		 {
			 System.out.println("Enter the datas: ");
//			 int d=s.nextInt();
			 list.add(s.nextInt());
		 }
		 System.out.println("the res is: "+list);
//		 list.add(34);
//		 list.add("nandhini");

	}

}
