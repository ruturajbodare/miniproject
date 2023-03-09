package factorydesignpattern;

public abstract class Plan {
	protected  double rate;
	abstract void getRate();
	public  void calculatebill(int units)
	{
		System.out.println(units*rate);
	}
	public void getrate() {
		// TODO Auto-generated method stub
		
	}

}
