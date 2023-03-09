package Threading;

public class Table {
	public void printTable(int n)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hii");
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}


}
