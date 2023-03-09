

package expectionalhandling;

public class student {
	private int id;
	private String sname;
	private String address;
	public student()
	{
		
	}
	
	public student(int id, String sname, String address) {
		super();
		this.id = id;
		this.sname = sname;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", address=" + address + "]";

}
	
}
