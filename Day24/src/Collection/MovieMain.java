package Collection;

import java.util.HashSet;

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Movie m1=new Movie("RRR","S.S.Rajamouli",4,3.4f);
        Movie m2=new Movie("lionking","jon",4,3.4f);
        Movie m3=new Movie("bhagubali","S.S.Rajamouli",4,3.4f);
        
        
        Movie m4=new Movie("avatar","james cameron",4,4.2f);
        HashSet<Movie> set=new HashSet<Movie>();
        set.add(m1);
        set.add(m2);
        set.add(m3);
        set.add(m4);
        for(Movie m:set)
        {
        	System.out.println(m);
        }
        
	}

}
