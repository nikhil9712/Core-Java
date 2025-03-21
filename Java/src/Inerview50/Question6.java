package Inerview50;

import java.util.ArrayList;
import java.util.List;

public class Question6 {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(8);
		list.add(17);
		list.add(12);
		list.add(14);
		
		for (Integer integer : list) {
			if (integer%2!=0) {
				System.out.println("Contains odd");
				return;
			}
		}
		System.out.println("Does not contains odd");
		
	}
}
