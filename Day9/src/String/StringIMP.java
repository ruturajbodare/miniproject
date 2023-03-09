package String;
import java.util.Scanner;
public class StringIMP {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter sentence");
	 String sentence=sc.nextLine();
	 String word[]=sentence.split(",");
	 for(String temp:word)
	 {
		 System.out.println(temp);
	 }

	}

}
