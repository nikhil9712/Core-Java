package collection;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

	String eName;
	int eid;

	public Employee(String eName, int eid) {
		this.eName = eName;
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Ecmployye [eName=" + eName + ", eid=" + eid + "]";
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Employee employee = (Employee) obj;
		return eid == employee.eid;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(eName) + eid;
	}

	// Will Implement Sorting Order Based On eid
	@Override
	public int compareTo(Employee o) {
		if (this.eid > o.eid) {
			return +1;
		} else if (this.eid < o.eid) {
			return -1;
		}
		return 0;
	}

}
