package Threading;

public class first extends Thread
{
	Table t;
	 first(Table t)
	{
		this.t=t;
	}
   public void run()
   {
	   t.printTable(5);
   }
}
