package CollectionSort;

public class EmployeeEx3 {
	 private int eid;
	  private String ename;
	  private String address;
	  private float salary;
	  private static int idgen=1001;
	  public EmployeeEx3()
	  {
		  eid=idgen++;
	  }
	public EmployeeEx3(String ename, String address, float salary) {
		super();
		this.ename = ename;
		this.address = address;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + ", salary=" + salary + "]";
	}
	

}
