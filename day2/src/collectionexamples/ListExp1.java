package collectionexamples;
import java.util.ArrayList;
import java.util.List;
public class ListExp1 {

	public static void main(String[] args) {
		
		// 1. arrays are fixed in size int a[3];
		// 2. delete , insert, add, find, fetch given data index
		
		// int a []= new int[3]
		
		//a[0]=10
		//a[1]=34
		//Animal d = new Dog();
		List al = new ArrayList();// i didn't specify
		// by default the type of the data is Object
		al.add(100);
		al.add("hackforge");
		al.add('n');
		al.add(34.45);
		al.add(56.6F);
		al.add(true);
		System.out.println("all the data: "+al);
//		String ans=(String) al.get(1);
 		Object res= al.get(0);
//		System.out.println(ans.length());
	 //	System.out.println(al.get(0));
	 	
	double	data=(double)al.get(3);// pick the particular index 
	System.out.println(data+100);
//		System.out.println(res);
	 
	}

}
