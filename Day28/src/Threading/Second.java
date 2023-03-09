package Threading;

public class Second {
	Table t;
	 Second(Table t)
	{
		this.t=t;
	}
  public void run()
  {
	   t.printTable(10);
  
  }
	
}
