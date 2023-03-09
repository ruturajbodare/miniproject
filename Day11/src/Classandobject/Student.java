package Classandobject;
import java.util.Arrays;
public class Student {
	int id;
	String name;
   String address;
     int []mark;
     int total=0;
  
   double percentage()
   {
	   for(int i=0;i<mark.length;i++)
	   {
		   total=total+mark[i];
	   }
	   double percentage=total*100/500.0;
	   return percentage;
   }
public String toString()
{
	return "id=:"+id+"\nName=:"+name+"\naddress=:"+address+"\nMarks=:"+Arrays.toString(mark)+"\nPercentage=:"+percentage();
    	
    }
}
