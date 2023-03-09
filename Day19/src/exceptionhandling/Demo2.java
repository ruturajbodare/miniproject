package exceptionhandling;
import java.util.Scanner;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		try
		{
			int z=x+y;
			int z1=x*y;
			int z2=x/y;
			int z3=x-y;
			System.out.println(z);
			System.out.println(z1);
			System.out.println(z2);
			System.out.println(z3);
		}
		catch(ArithmeticException e)
		{
			System.out.println();
		}

	}

}
