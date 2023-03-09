package exceptionhandling;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		System.out.println(num);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
