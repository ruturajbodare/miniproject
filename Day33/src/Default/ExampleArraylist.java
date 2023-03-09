package Default;

import java.util.ArrayList;
import java.util.List;

public class ExampleArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name=new ArrayList<String>();
       name.add("ajeet");
       name.add("negan");
       name.add("aditya");
       name.add("steve");
       // normal method to find out value of string
       int count=0;
       for(String str:name)
       {
    	   if(str.length()<6)
    		   count ++;
    	 
       }
       //String method to find out value of string
       long count1=name.stream().filter(str->str.length()<6).count();
       System.out.println("there are "+ count1 +" string with length less than 6");
       System.out.println("there are "+ count +" string with length less than 6");
	}

}
