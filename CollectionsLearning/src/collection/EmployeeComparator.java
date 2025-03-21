package collection;

import java.util.Comparator;

public class EmployeeComparator<T> implements Comparator<T> {

	@Override
	public int compare(Object o1, Object o2) {

		Employee employee1 = (Employee) o1;
		Employee employee2 = (Employee) o2;

		return employee1.eName.compareTo(employee2.eName);

	}

}
