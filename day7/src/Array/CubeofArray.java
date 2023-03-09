package Array;

import java.util.Scanner;

public class CubeofArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array number");
		int size=sc.nextInt();
		int sum=0;
		int cube;
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			cube=a[i]*a[i]*a[i];
			sum=sum+cube;
			
			

			
		}
		System.out.println("sum of array cube:"+sum);

	}

}
