package Oops;

public class Ebill {
	private int billnumber;
	private int noofunit;
	private int costperunit;

	
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
	
	public double Calculation(){
		double calculation=noofunit*costperunit;
		return calculation;
	}
	@Override
	public String toString() {
		return ("billnumber=" + billnumber + "\nnoofunit=" + noofunit + "\ncostperunit=" + costperunit
				+ "\ncalculation="+Calculation());
	}
	

	}
	


