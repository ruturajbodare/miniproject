package Collection;

import java.util.TreeMap;

public class OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order m1=new Order(12,45,65);
		Order m2=new Order(13,70,45);
		Order m3=new Order(14,50,95);
		TreeMap<Integer,Order> m=new TreeMap<Integer,Order>();
		m.put(m1.getOrderid(),m1);
		m.put(m2.getOrderid(),m2);
		m.put(m3.getOrderid(),m3);

		System.out.println(m);
	}

}
