package Oops;
class Account
{
	private long acc_no;
	private String name;
	private String email;
	private float ammount;
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmmount() {
		return ammount;
	}
	public void setAmmount(float ammount) {
		this.ammount = ammount;
	}
	
}

public class EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Account rr=new Account();
       rr.setAcc_no(9923308376l);
       rr.setName("ruturaj");
       rr.setEmail("ruturajbd22@gmail.com");
       rr.setAmmount(60000f);
       System.out.println("account number:"+rr.getAcc_no()+"\nName;"+rr.getName()+"\nEmail"+rr.getEmail()+"\nAmmount"+rr.getAmmount());
       
	}

}
