package Threading;

public class MultiThreadingEx2 extends Thread {
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
		MultiThreadingEx2 m=new MultiThreadingEx2();
		m.start();
		m.setName("first");
		m.setPriority(MAX_PRIORITY);
		System.out.println(m.getName());
		System.out.println(m.getPriority());
		try
		{
			m.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		MultiThreadingEx2 m1=new MultiThreadingEx2();
		m1.start();
		m1.setName("second");
		System.out.println(m1.getName());
		m1.setPriority(MIN_PRIORITY);
		
		System.out.println(m
				.getPriority());
		
		
        
	}

}
