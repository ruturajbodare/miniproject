package Array;
import java.util.Scanner;
public class SumofArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int size=sc.nextInt();
		int sum=0;
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();

			
		}
		for(int j=0;j<size;j++)
		{
			sum=sum+j;
			System.out.println(a[j]);
			
		}
		System.out.println("sum of array:"+sum);
	

	}

}
