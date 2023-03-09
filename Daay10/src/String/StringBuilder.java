
package String;

public class StringBuilder {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuilder str=new Stringbuilder("welcome for");
        str.append("my session");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.insert(1,'e');
        System.out.println(str);
        str.replace(8,10,"to");
        System.out.println(str);
        str.replace(7,8,"q");
        System.out.println(str);
        str.delete(,7,8);
        System.out.println(str);
	}

}
