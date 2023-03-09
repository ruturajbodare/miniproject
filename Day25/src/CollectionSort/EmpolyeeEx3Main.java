package CollectionSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class EmpolyeeEx3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeEx3 e1=new EmployeeEx3("siva","CBE",73000);
		EmployeeEx3 e2=new EmployeeEx3("gayathri","banglore",43000);
		EmployeeEx3 e3=new EmployeeEx3("radhai","pune",63000);
		ArrayList<EmployeeEx3>list=new ArrayList<EmployeeEx3>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		
      System.out.println("=================");
      for(EmployeeEx3 e:list)
      {
    	  System.out.println(e);
      }
      System.out.println("=================sorting");
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the choice");
      int choice=sc.nextInt();
      if(choice==1)
      {
      NameSort n=new NameSort();
      Collections.sort(list,n);
      
      for(EmployeeEx3 e:list)
      {
    	  System.out.println(e);
      }
      }
      else
      {
    	  SalarySort s=new SalarySort();
          Collections.sort(list,s);
          
          for(EmployeeEx3 e:list)
          {
        	  System.out.println(e);
          }
      }

	}

}
