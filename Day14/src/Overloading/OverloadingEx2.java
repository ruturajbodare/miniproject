package Overloading;

public class OverloadingEx2 {
	public void addition(int a,int b)
	{
		int addition=a+b;
		System.out.println("Addition of two number:"+addition
				);
	}
	public void addition(int c,int d,int e)
	{
		int addition=c+d+e;
		System.out.println("addition of three number:"+addition);
	}
	public void addition(double p,double q,double r)
	{
		double addition=p+q+r;
		System.out.println("addition of three numbers:"+addition);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      OverloadingEx2 a=new OverloadingEx2();
    		  a.addition(12,32);
    		  a.addition(12,34,32);
              a.addition(32,23.3,4.4);
		
	}

}
