package exceptionhandling;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1001,"chair",150.0f);
		Product p2=new Product(1002,"kidschair",400.0f);
		Product p3=new Product(1003,"Tablemate",300.0f);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
      calculateWeight(p1);
	}
	public static void calculateWeight(Product p)
	{
		
		if(p.getProductweight()<200)
		{
			try
			{
		 throw new Exception("product weight low");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}
