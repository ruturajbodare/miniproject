package Constructor;

public class Srudent {
	int id;
	String name;
   String address;
   
   
   
     
     public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
	public Srudent()
     {
    	 
     }
     public Srudent(int i,String j,String k)
     {
    	 id=i;
    	 name=j;
    	 address=k;
    	 
     }
     int []mark;
     
     public int[] getMark() {
		return mark;
	}
	public void setMark(int[] mark) {
		this.mark = mark;
	}
	int total=0;
  
   double percentage()
   {
	   for(int i=0;i<mark.length;i++)
	   {
		   total=total+mark[i];
	   }
	   double percentage=total*100/500.0;
	   return percentage ;
   }
	@Override
	public String toString() {
		return ("id=" + id + "\nname=" + name + "\naddress=" + address+"\nmarks=");
	}
     
 
   }
   

