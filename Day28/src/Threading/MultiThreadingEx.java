package Threading;

public class MultiThreadingEx extends Thread {
	public void run()
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadingEx m=new MultiThreadingEx();
		m.start();
		MultiThreadingEx m1=new MultiThreadingEx();
		m1.start();
		

	}

}
