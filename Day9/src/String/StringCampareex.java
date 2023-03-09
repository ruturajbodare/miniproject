package String;

public class StringCampareex {

	public static void main(String[] args) {
		
		 String s="hello";
	       String s1="hello";
	       if(s.equalsIgnoreCase(s1))
	    	   //if(s==s1)
	    	   //if(s.hashCode()==s1.hashCode()) base on hashCodewe can also compare it
	       {
	    	   System.out.println("true");
	    	   
	       }
	       else
	       {
	    	   System.out.println("false");

	       }

	}

}
//string s="hello";
//string s1="hello";
//System.out.println(s.compareTo(s1));
