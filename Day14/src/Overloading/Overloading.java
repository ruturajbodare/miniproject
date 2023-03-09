package Overloading;
//over loading is same method we use in same class again with different
public class Overloading {
   private static void display(int a)
   {
	   System.out.println("Argument:"+a);
   }
   private static void display(int a,int b)
   {
	   System.out.println("Argument:"+a+"and"+b);
   }
   private static void display(String c,int s)
   {
	   System.out.println("Language:"+c+s);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 display(10);
 display(10,20);
 display("java",20);
	}

}
