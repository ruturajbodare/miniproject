package Constructor;

public class Bill {
	private int billnumber;
	private int noofunit;
	private int costperunit;
	public Bill()
	{
		
	}
	public Bill(int i,int j,int k)
	{
		billnumber=i;
		noofunit=j;
		costperunit=k;	
	}
	public int getBillnumber() {
		return billnumber;
	}
	public void setBillnumber(int billnumber) {
		this.billnumber = billnumber;
	}
	public int getNoofunit() {
		return noofunit;
	}
	public void setNoofunit(int noofunit) {
		this.noofunit = noofunit;
	}
	public int getCostperunit() {
		return costperunit;
	}
	public void setCostperunit(int costperunit) {
		this.costperunit = costperunit;
	}
	@Override
	public String toString() {
		return "Bill [billnumber=" + billnumber + ", noofunit=" + noofunit + ", costperunit=" + costperunit + "]";
	}
	
}
