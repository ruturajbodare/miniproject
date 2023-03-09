package Array;

import java.util.Arrays;

public class SaloCopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,9,3,4,5};
		int a1[];
		a1=a;
		
			System.out.println(Arrays.toString(a1));
			System.out.println(Arrays.toString(a));
            a[0]++;
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(a1));


	}

}
