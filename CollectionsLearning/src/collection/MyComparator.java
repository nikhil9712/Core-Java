package collection;

import java.util.Comparator;

public class MyComparator<T> implements Comparator<T> {

	@Override
	public int compare(Object o1, Object o2) {
		String i1 = o1.toString();
		String i2 = o2.toString();

		return i2.compareTo(i1);
	}

}
