package Overloading;

public class methodOverloading {
public void square()
{
	System.out.println("no parameter method called:");
}
public void square(int num)
{
	int square=num*num;
	System.out.println("method with integer argument:"+square);
}
public void square(double num)
{
	double square=num*num;
	System.out.println("method with integer argument:"+square);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverloading r=new methodOverloading();
		r.square();
		r.square(10);
		r.square(40.40);

	}

}
