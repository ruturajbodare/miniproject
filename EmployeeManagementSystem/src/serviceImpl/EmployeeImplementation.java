package serviceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Employee;
import service.EmployeeService;

public class EmployeeImplementation implements EmployeeService
{
	 List<Employee>list=new ArrayList<Employee>();
	 public EmployeeImplementation()
	 {
		 Employee e1=new Employee(1001,"ruturaj",230000,"cbe",2);
		 list.add(e1);
	 }
	@Override
	public void addEmployee() 
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the id");
		  int empid=sc.nextInt();
		  System.out.println("enter the name");

		  String ename=sc.next();
		  System.out.println("enter theslary");

		  float salary=sc.nextFloat();
		  System.out.println("enter theaddress");

		  String address=sc.next();
		  System.out.println("enter the exp");
		  int exp=sc.nextInt();
		  Employee e2=new Employee(empid,ename,salary,address,exp);
		  list.add(e2);
        
	}

	@Override
	public void updateEmployee() throws NumberFormatException,IOException
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the id");
		  int id=sc.nextInt();
		  int flag=0,index=0;
		  Employee s=null;
		  for(Employee e:list)
		  {
			  if(e.geteId()==id)
			  {
				flag=1;
				index=list.indexOf(e);
				s=e;
				System.out.println(s);
				break;
			  }
		  }
		  if(flag==1) {
		  System.out.println("enter the name");

		  String ename=sc.next();
		  System.out.println("enter theslary");

		  float salary=sc.nextFloat();
		  System.out.println("enter theaddress");

		  String address=sc.next();
		  System.out.println("enter the exp");
		  int exp=sc.nextInt();
		  s.seteName(ename);
		  s.setSalary(salary);
		  s.setAddress(address);
		  s.setExp(exp);
		  list.set(index, s);
		  System.out.println("===========================================================");
		  }
		  else
		  {
			  System.out.println("id does not exist!!"); 
		  }
       
		  System.out.println("===========================================================");
		
	}

	@Override
	public void deleteEmployee()  throws NumberFormatException,IOException {
	  
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		  int id=sc.nextInt();
		  int flag=0,index=0;
		  Employee s=null;
		  for(Employee e:list)
		  {
			  if(id==e.geteId())
			  {
				flag=1;
				index=list.indexOf(e);
				s=e;
				System.out.println(s);
				break;
			  }
		
	}
		  System.out.println("===========================================================");
		  if(flag==0)
		  {
			  System.out.println("Employee id does not exist!!"); 
		  }
		  else
		  {
			  list.remove(s);
			  System.out.println("Employee record deleted successfully!!"); 
		  }
	}

	public void findAllEmployee() {
		// TODO Auto-generated method stub
		
		if(list.size()==0)
		{	
				System.out.println("No record found!!");	
		}
		for(Employee s1:list)
		{
			System.out.println(s1);
		}	
	}
}  