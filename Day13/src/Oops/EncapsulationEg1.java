package Oops;

public class EncapsulationEg1 {
		
     private int productid;
     private String productname;
     private int nooforder;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getNooforder() {
		return nooforder;
	}
	public void setNooforder(int nooforder) {
		this.nooforder = nooforder;
	}
	@Override
	public String toString() {
		return "EncapsulationEg1 [productid=" + productid + ", productname=" + productname + ", nooforder=" + nooforder
				+ "]";
	
	}
		
		
	}


