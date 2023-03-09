package Array;
import java.util.Scanner;
public class Array2DEx3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and col of array");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("output:");
	
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]);
			}
			
			System.out.println();
		}



	}

}
