package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSoryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name=Arrays.asList("Sansa","Jon","Araya");
		List<String> sortname=name.stream().sorted()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
        System.out.println(sortname);

	}

}
