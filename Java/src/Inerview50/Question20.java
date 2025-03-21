package Inerview50;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question20 {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5,6};
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		Collections.shuffle(list);
		Object[]a2=list.toArray();
		for (int i = 0; i < a2.length; i++) {
			int ip=(int) a2[i];
			System.out.println(ip);
		}
	}
}
