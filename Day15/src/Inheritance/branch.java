package Inheritance;

public class branch extends bank{
	int branchcode;
	String branchname;
	public branch()
	{
		
	}
	public branch(int code,String name,int branchcode,String branchname)
	{
		super(code,name);
		this.branchcode=branchcode;
		this.branchname=branchname;
		
		
	}
	public int getBranchcode() {
		return branchcode;
	}
	public void setBranchcode(int branchcode) {
		this.branchcode = branchcode;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	@Override
	public String toString() {
		return super.toString()+"branch [branchcode=" + branchcode + ", branchname=" + branchname + "]";
	}
	
}
