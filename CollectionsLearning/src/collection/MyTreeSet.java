package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTreeSet {

	public static void main(String[] args) {

		TreeSet set = new TreeSet(new MyComparator<>());
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("a");
		set.add("D");

		System.out.println(set); // [A, B, C, D, a]

		TreeSet<Integer> set1 = new TreeSet();
		set1.add(2);
		set1.add(5);
		set1.add(4);
		set1.add(3);
		set1.add(1);

		System.out.println(set1); // [1, 2, 3, 4, 5]

		TreeSet set3 = new TreeSet(new MyComparator<>());
		set3.add(new StringBuilder("A"));
		set3.add(new StringBuilder("D"));
		set3.add(new StringBuilder("C"));
		set3.add(new StringBuilder("B"));
		set3.add(new StringBuilder("E"));

		System.out.println(set3); // [1, 2, 3, 4, 5]

		TreeSet set4 = new TreeSet(new MyComparator2<>());
		set4.add("A");
		set4.add(new StringBuilder("ABC"));
		set4.add(new StringBuilder("AA"));
		set4.add(new StringBuilder("A"));
		set4.add("XX");
		set4.add("ABCD");
		set4.add("A");

		System.out.println(set4); // [1, 2, 3, 4, 5]

		TreeSet<Employee> set5 = new TreeSet<>();
		Employee employee1 = new Employee("nag", 100);
		Employee employee2 = new Employee("balaiah", 200);
		Employee employee3 = new Employee("chiru", 50);
		Employee employee4 = new Employee("venki", 150);
		Employee employee5 = new Employee("nag", 100);

		set5.add(employee1);
		set5.add(employee2);
		set5.add(employee3);
		set5.add(employee4);
		set5.add(employee5);

		System.out.println(set5);

		TreeSet<Employee> set6 = new TreeSet<>(new EmployeeComparator<>());

		set6.add(employee1);
		set6.add(employee2);
		set6.add(employee3);
		set6.add(employee4);
		set6.add(employee5);

		System.out.println(set6);

	}
}
