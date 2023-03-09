package Customer;

public class PersonalDetails {
	private String name;
	private String address;
	private int Phonenumber;
	private String Emailadress;
	
	public PersonalDetails()
	{
		
	}

	public PersonalDetails(String name, String address, int phonenumber, String emailadress) {
		super();
		this.name = name;
		this.address = address;
		Phonenumber = phonenumber;
		Emailadress = emailadress;
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

	public int getPhonenumber() {
		return Phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		Phonenumber = phonenumber;
	}

	public String getEmailadress() {
		return Emailadress;
	}

	public void setEmailadress(String emailadress) {
		Emailadress = emailadress;
	}

	@Override
	public String toString() {
		return "PersonalDetails \n"
				+ "name=" + name + "\n address=" + address + "\n Phonenumber=" + Phonenumber
				+ "\n Emailadress=" + Emailadress ;
	}
	

}
