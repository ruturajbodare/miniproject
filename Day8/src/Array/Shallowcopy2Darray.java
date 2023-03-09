package Array;
import java.util.*;

public class Shallowcopy2Darray {

	public static void main(String[] args) {
			int a[][]= {{1,2},{3,4},{5,6}};
			int b[][]=a.clone();
			for(int temp[]:b)
			{
				System.out.println(Arrays.toString(temp));
			}
	       a[0][0]++;
	       System.out.println("==================== ");
	       for(int temp[]:a)
			{
				System.out.println(Arrays.toString(temp));
			}
	       System.out.println("==============");
	       for(int temp[]:b)
			{
				System.out.println(Arrays.toString(temp));
			}

	}

}
