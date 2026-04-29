package collectionexamples;

import java.util.ArrayList;
import java.util.List;

public class ListExp2 {

	public static void main(String[] args) {

List<Integer> intData = new ArrayList();

intData.add(12);
intData.add(23);

System.out.println(intData);

Integer ans= intData.get(1);
int ans1= intData.get(1);
System.out.println(ans);
System.out.println(ans1);


	}

}
