package Classandobject;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.id=1001;
		emp.name="RUTURAJ";
		emp.salary=34000;
		System.out.println("The Employee id=:"+emp.id);
		System.out.println("The Employee name=:"+emp.name);
		System.out.println("The Employee salary=:"+emp.salary);
		System.out.println("Annual Salary=:"+emp.annualSalary());
		System.out.println("Pf=:"+emp.pf());
        System.out.println("-----------------------------------");
        
        Employee emp2=new Employee();
		emp2.id=1002;
		emp2.name="Ram";
		emp2.salary=35000;
		System.out.println("The Employee id=:"+emp2.id);
		System.out.println("The Employee name=:"+emp2.name);
		System.out.println("The Employee salary=:"+emp2.salary);
		System.out.println("Annual Salary=:"+emp2.annualSalary());
		System.out.println("Pf=:"+emp2.pf());
        System.out.println("-----------------------------------");
        
        Employee emp3=new Employee();
		emp3.id=1003;
		emp3.name="sham";
		emp3.salary=38000;
		System.out.println("The Employee id=:"+emp3.id);
		System.out.println("The Employee name=:"+emp3.name);
		System.out.println("The Employee salary=:"+emp3.salary);
		System.out.println("Annual Salary=:"+emp3.annualSalary());
		System.out.println("Pf=:"+emp3.pf());
        System.out.println("-----------------------------------");
	}

}
