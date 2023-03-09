package String;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StringBuffer sb=new StringBuffer("hello");
    sb.append("learning");
    System.out.println(sb);
    //reverse,insert,replace,delete
    //sb.reverse();
    //
    
    System.out.println(sb);
    sb.insert(1,'e');
    System.out.println(sb);
    sb.replace(8,10,"to");
    System.out.println(sb);
    sb.replace(7,8,"q");
    System.out.println(sb);
    sb.delete(7,8);
    System.out.println(sb);
    
	}

}
