package numberprograms3;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		int[] a = { 2, 1, 6, 5, 3, 6, 4, 2, 5, 4, 2, 2 };
		
		int target = 7;


		ArrayList<List<Integer>> arrayList = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				
				ArrayList<Integer> list = new ArrayList<>();
				if (a[i] + a[j] == target) {
					list.add(i);
					list.add(j);
					arrayList.add(list);
				}
			}

		}
		
		System.out.println(arrayList);
		
		
	}
}
