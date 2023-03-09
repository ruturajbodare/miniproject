package Abstraction;

public class Waterbill implements calculation {
	private int billno;
	private int noofliter;
	private int costperliter;
	public Waterbill()
	{
		
	}
	public Waterbill(int billno, int noofliter, int costperliter) {
		super();
		this.billno = billno;
		this.noofliter = noofliter;
		this.costperliter = costperliter;
	}
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public int getNoofunits() {
		return noofliter;
	}
	public void setNoofunits(int noofunits) {
		this.noofliter = noofliter;
	}
	public int getCostperunit() {
		return costperliter;
	}
	public void setCostperunit(int costperunit) {
		this.costperliter = costperliter;
	}
	@Override
	public double calculation() {
	
		return noofliter*costperliter;
	}
	@Override
	public void display() {
		System.out.println("the waterbill is ="+calculation());
		
	}
	@Override
	public String toString() {
		return "waterbill[billno=" + billno + ", noofliter=" + noofliter + ", costperliter=" + costperliter + "]";
	}
	
    

}
