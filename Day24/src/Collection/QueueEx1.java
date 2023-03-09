package Collection;

import java.util.PriorityQueue;

public class QueueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		p.add(12);
		p.add(45);
		p.add(13);
		p.add(90);
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.element());
		System.out.println(p.remove());
		System.out.println(p);
		System.out.println(p.element());
		System.out.println(p.remove());
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.element());
		System.out.println(p.remove());
		
	}

}
