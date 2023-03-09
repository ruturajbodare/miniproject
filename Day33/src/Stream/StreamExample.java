package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream =Stream.of(1,2,3,4,5,6,7,8,9); 
		stream.forEach(p->System.out.println(p));
        Stream<Integer> stream1 =Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9}); 
        stream1.forEach(p->System.out.println(p));
        List<Integer> list = new ArrayList<Integer>();

				for(int i = 1; i< 10; i++){
					list.add(i);
				}
				Stream<Integer> stream2 = list.stream(); 
				stream2.forEach(p-> System.out.println(p));
				//random
				Stream<Integer> randomNumber = Stream
						
						 .generate(()->(newrandom()).nextint(100));
				randomNumber.limit(20).forEach(n->System.out.println(n));

	}


}
