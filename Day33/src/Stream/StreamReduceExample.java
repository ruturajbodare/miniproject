package Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>words=Arrays.aslist("java","c++","j2ee","datascience","python");
		// The lambda expression passed

		to

		// reduce() method takes two

		Strings

		// and returns the longer String. // The result of the reduce()

		method is
		// an Optional because the list on which

		// reduce() is called may be empty. Optional<String> longestString = words.stream()

		.reduce((word1, word2) -> word1.length() >

		word2.length() ? word1: word2); //condition?true:false // Displaying the longest String longestString.ifPresent(n->Syste m.out.print(n));
	}

}
