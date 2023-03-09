package Collection;

import java.util.Comparator;

public class RatingSort implements Comparator<MovieEx2>{

	@Override
	public int compare(MovieEx2 o1, MovieEx2 o2) {
		// TODO Auto-generated method stub
		return Float.compare(o1.getRating(), o2.getRating());
	}

}
