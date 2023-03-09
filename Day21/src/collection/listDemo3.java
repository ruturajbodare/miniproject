package collection;

import java.util.ArrayList;

public class listDemo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(12);
		list.add(34);
		list.add(67);
		list.add(90);
		list.add(23);
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.set(1,19));
		System.out.println(list);
		System.out.println(list.remove(2));
		System.out.println(list);


}
}