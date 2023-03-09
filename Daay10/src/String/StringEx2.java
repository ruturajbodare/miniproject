package String;

public class StringEx2 {

	public static void main(String[] args) {
	 String value="welcome";
	 String value1="to";
	 String value2="java full stack";
	 System.out.println(value.trim());
	 System.out.println(value.length());
	 System.out.println(value+value1+value2);
     String str=value.concat(value1);
     System.out.println(str);
     String str2=str.concat(value2);
     System.out.println(str2);
     boolean result=value.equals(value2);
     System.out.println();
     char ch[]= {'r','u','t','u'};
     String s=new String(ch);
     System.out.println(s);
     String s1="ruturaj";
     System.out.println("char at position 5; "+s1.charAt(5));
     System.out.println("index of char e; "+s1.indexOf('a'));
     
     System.out.println(s1.substring(0,4));
     String text=new String("hai,this is ruturaj");
     

	}

}
