package exceptionhandling;

public class Product {
	private int pid;
	private String pname;
	private float productweight;
	public Product()
	{
		
	}
	public Product(int pid, String pname, float productweight) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.productweight = productweight;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getProductweight() {
		return productweight;
	}
	public void setProductweight(float productweight) {
		this.productweight = productweight;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", productweight=" + productweight + "]";
	}
}
