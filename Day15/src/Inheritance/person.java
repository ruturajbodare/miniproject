package Inheritance;

public class person  {
	int id;
	String name;
	String address;
	String city;
	String state;
	public person()
	{
		
	}
	public person(int id, String name, String address, String city, String state) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", state=" + state
				+ "]";
	}
	
	
	

}
