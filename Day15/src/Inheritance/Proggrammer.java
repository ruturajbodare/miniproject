package Inheritance;

public class Proggrammer extends Employee {
	int salary;
	int pf;
	public Proggrammer()
	{
		
	}
	public Proggrammer(int eld,String ename,int salary,int pf)
	{
		
		setEname(ename);
		this.salary=salary;
		this.pf=pf;
		
		
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
		
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return super.toString()+
		"Proggrammer [salary=" + salary + ", pf=" + pf + "]";
	}
	

}
