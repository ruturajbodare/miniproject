package Inheritance;



public class student extends person {
	private int attndance ;
   private int m1;
    private int m2;
   private int m3;

    public student()
    {
        
    }
	public student( int id, String name, String address, String city, String state,int attndance, int m1, int m2, int m3) {
		super(id,name,address,city,state);
		this.attndance = attndance;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public int getAttndance() {
		return attndance;
	}
	public void setAttndance(int attndance) {
		this.attndance = attndance;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public int total() 
	{
		int total=m1+m2+m3;
		return total;
	}
	public double per()
	{
		double per=(total()*100)/300;
		return per;
	}
	@Override
	public String toString() {
		return super.toString()+"student [attndance=" + attndance + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", total=" + total()
				+"percentage="+per()+ "]";
	}
    
    
    
}