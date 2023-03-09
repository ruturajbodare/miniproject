package Collection;

import java.util.TreeSet;

public class MovieEx2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1=new Movie("RRR","S. S. Rajamouli",4,3.3f);
		Movie m2=new Movie("LionKing","Jon Favreau",3.5f,4.4f);
		Movie m3=new Movie("Bhagubali","S. S. Rajamouli",4f,3.4f);
		Movie m4=new Movie("Avatar","James Cameron",3.3f,4.2f);
		RatingSort r=new RatingSort();
		TreeSet<Movie>set=new TreeSet<Movie>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		set.add(m4);
		for(Movie m:set)
		{
			System.out.println(m);
		}
	}

}
