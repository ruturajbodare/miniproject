package CollectionSort;
import java.util.Comparator;

public class NameSort implements Comparator<EmployeeEx3> {

	@Override
	public int compare(EmployeeEx3 o1, EmployeeEx3 o2) {
		// TODO Auto-generated method stub
		return o1.getEname().compareTo(o2.getEname());
	}

}
