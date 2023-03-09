package Inheritance;

public class city extends branch {
	String cityname;
	String address;
	
	public city()
	{
		
	}
	public city(int code,String name,int branchcode,String branchname,String cityname,String address)
	{
		super(code,name,branchcode,branchname);
		this.cityname=cityname;
		this.address=address;
		
		
		
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return super.toString()  +"city [cityname=" + cityname + ", address=" + address + "]";
	}
	


}
