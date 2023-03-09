package Example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class LvcExample {
	//another way
  //private static int var=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(1,2,3);
		int var=10;
		list.forEach(x->System.out.println(x+var));
		

	}

}
