package CollectionTree;
import java.util.Map;
import java.util.TreeMap;

public class OrdersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Orders o1=new Orders(1004,23,99);
    Orders o2=new Orders(1002,25,299);
    Orders o3=new Orders(1001,22,199);
    TreeMap<Integer,Orders> map=new TreeMap<Integer,Orders>();
    map.put(o1.getOrderid(), o1);
    map.put(o2.getOrderid(), o2);
    map.put(o3.getOrderid(), o3);
    for(Map.Entry<Integer,Orders> m:map.entrySet())
    {
    	System.out.println(m);
    }
	}

}
