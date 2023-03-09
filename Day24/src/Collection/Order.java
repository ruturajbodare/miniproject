package Collection;

public class Order {
	private int orderid;
	private int noofproduct;
	private int nooforder;
	public Order()
	{
		
	}
	public Order(int orderid, int noofproduct, int nooforder) {
		super();
		this.orderid = orderid;
		this.noofproduct = noofproduct;
		this.nooforder = nooforder;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getNoofproduct() {
		return noofproduct;
	}
	public void setNoofproduct(int noofproduct) {
		this.noofproduct = noofproduct;
	}
	public int getNooforder() {
		return nooforder;
	}
	public void setNooforder(int nooforder) {
		this.nooforder = nooforder;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", noofproduct=" + noofproduct + ", nooforder=" + nooforder + "]";
	}
	

}
