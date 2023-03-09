package Inheritance;

public class Employee {
	private int eld;
	private String ename;
	public Employee ()
	{
		
	}
	public Employee(int eld,String ename )
	{
		super();
		this.eld=eld;
		this.ename=ename;
		
		
	}
	public int getEld() {
		return eld;
	}
	public void setEld(int eld) {
		this.eld = eld;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eld=" + eld + ", ename=" + ename + "]";
	}
	

}
