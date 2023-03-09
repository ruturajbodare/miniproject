package Overriding;

public class methodOverriding {
	public void add(int a, int b)
	{
		int add=a+b;
		System.out.println("Addition of two number :" +add);
		
	}
	public void add(int a,int b,int c )
	{
		int add=a+b+c;
		System.out.println("Addition of three number :" +add);
		
	}
	public void add(int a,int b,int c,int d)
	{
		int add=a+b+c+d;
		System.out.println("Addition of four number :" +add);
		
	}
	public static  void main(String[] args)
	{
		methodOverriding obj = new methodOverriding();
		obj.add(7, 9);
		obj.add(4, 6, 1);
		obj.add(5, 8, 3, 7);
	}

}
