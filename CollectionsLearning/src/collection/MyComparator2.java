package collection;

import java.util.Comparator;

public class MyComparator2<T> implements Comparator<T> {

	@Override
	public int compare(Object o1, Object o2) {
		String i1 = o1.toString(); 
		String i2 = o2.toString();

		if (i1.length() == i2.length()) {
			return i1.compareTo(i2);
		}

		return Integer.valueOf(i1.length()).compareTo(i2.length());

	}

}
