 package Collection;

import java.util.ArrayList;
import java.util.List;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("gayathri","CBE",23000);
		Employee e2=new Employee("ravi","banglore",43000);
		Employee e3=new Employee("radhai","pune",63000);
		ArrayList<Employee>list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		salaryCalculation(list);

	}
	public static void salaryCalculation(List<Employee>list)
	{
		for(Employee e:list)
		{
			if(e.getSalary()>=50000)
			{
				System.out.println(e.getEid());
			}
		}
	}

}
