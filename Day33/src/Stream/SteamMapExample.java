package Stream;

import java.util.Arrays;
import java.util.List;

public class SteamMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name=Arrays.asList("Sansa","Jon","Araya");
        name.stream().filter((s)->s.startsWith("A"))
        .map(String::toUpperCase)
        .forEach(n->System.out.println(n));
	}

}
