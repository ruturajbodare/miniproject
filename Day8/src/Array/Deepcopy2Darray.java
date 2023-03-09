package Array;
import java.util.Arrays;
public class Deepcopy2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{3,4},{5,6}};
		int b[][]=a;
		for(int temp[]:b)
		{
			System.out.println(Arrays.toString(temp));
		}
		a[0][0]++;
		System.out.println("b data");
		for(int temp[]:b)
		{
			System.out.println(Arrays.toString(temp));
		}

	}

}
