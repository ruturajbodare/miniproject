package Oops;

public class EncapsulationEg1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      EncapsulationEg1 p=new EncapsulationEg1();
      p.setProductid(1001);
      p.setProductname("books");
      p.setNooforder(12);
      System.out.println("product id:"+p.getProductid());
      System.out.println("product name:"+p.getProductname());
      System.out.println("no of product:"+p.getNooforder());
      
      }

}
