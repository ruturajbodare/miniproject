package Collection2;

import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list =new LinkedList<Integer>();
		list.add(12);
		list.add(13);
		list.add(12);
		list.add(90);
		list.add(23);
		System.out.println(list);
		list.addFirst(11);
		list.addLast(19);
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		System.out.println(list.get(0));
		list.set(0,100);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		 
		
		

	}

}
