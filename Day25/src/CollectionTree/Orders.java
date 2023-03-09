package CollectionTree;

public class Orders {
	private int orderid;
	private int nooforder;
	private int noofproduct;
	public Orders()
	{
		
	}
	public Orders(int orderid, int nooforder, int noofproduct) {
		super();
		this.orderid = orderid;
		this.nooforder = nooforder;
		this.noofproduct = noofproduct;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getNooforder() {
		return nooforder;
	}
	public void setNooforder(int nooforder) {
		this.nooforder = nooforder;
	}
	public int getNoofproduct() {
		return noofproduct;
	}
	public void setNoofproduct(int noofproduct) {
		this.noofproduct = noofproduct;
	}
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", nooforder=" + nooforder + ", noofproduct=" + noofproduct + "]";
	}
	

}
