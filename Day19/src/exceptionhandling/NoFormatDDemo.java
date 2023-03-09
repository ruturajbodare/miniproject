package exceptionhandling;

public class NoFormatDDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		try
		{
		int i=Integer.parseInt(s);
		System.out.println(i);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		
	}

}
