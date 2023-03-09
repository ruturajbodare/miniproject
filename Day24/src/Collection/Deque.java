package Collection;
import java.util.Deque;
import java.util.LinkedList;

public class Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Deque<Integer> queue=new LinkedList<Integer>();
     queue.add(13);
     queue.add(90);
     queue.add(78);
     System.out.println(queue);
     queue.addfirst(12);
     queue.addlast(88);
     System.out.println(queue);
     queue.removefirst(12);
     queue.removelast(88);
     System.out.println(queue);
	}

}
