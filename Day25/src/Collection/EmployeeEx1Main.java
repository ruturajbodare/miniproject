package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class EmployeeEx1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeEx1 e1=new EmployeeEx1("gayathri","CBE",73000);
		EmployeeEx1 e2=new EmployeeEx1("ravi","banglore",43000);
		EmployeeEx1 e3=new EmployeeEx1("radhai","pune",63000);
		ArrayList<EmployeeEx1>list=new ArrayList<EmployeeEx1>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		salaryCalculation(list);
      System.out.println("=================");
      for(EmployeeEx1 e:list)
      {
    	  System.out.println(e);
      }
      System.out.println("=================sorting");
      Collections.sort(list);
      for(EmployeeEx1 e:list)
      {
    	  System.out.println(e);
      }
	}
	public static void salaryCalculation(List<EmployeeEx1>list)
	{
		for(EmployeeEx1 e:list)
		{
			if(e.getSalary()>=50000)
			{
				System.out.println(e.getEid());
			}
		}
	}

}
