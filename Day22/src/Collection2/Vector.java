package Collection2;
import java.util.*;
public class Vector {

	public static void main(String[] args) {
		Vector<Integer> v =new Vector<Integer>();
		v.add(12);
		v.add(13);
		v.add(12);
		v.add(90);
		v.add(23);
		System.out.println(v);
		v.add(2,24);
		System.out.println(v.get(0));
		v.set(3,20);
		System.out.println(v);
        v.remove(2);
        System.out.println(v);


	}

}
