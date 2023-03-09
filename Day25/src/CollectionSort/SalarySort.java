package CollectionSort;

import java.util.Comparator;

public class SalarySort implements Comparator<EmployeeEx3> {

	@Override
	public int compare(EmployeeEx3 o1, EmployeeEx3 o2) {
		// TODO Auto-generated method stub
		return Float.compare(o1.getSalary(), o2.getSalary());
	}

}
