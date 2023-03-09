package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
  //    HashSet<Integer> set=new HashSet<Integer>();
      set.add(12);
      set.add(11);
      set.add(12);
      set.add(13);
      set.add(14);
      set.add(15);
      set.add(16);
      System.out.println(set);
	}

}
