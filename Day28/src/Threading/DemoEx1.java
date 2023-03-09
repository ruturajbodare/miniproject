package Threading;

public class DemoEx1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
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
		 DemoEx1 d=new  DemoEx1();
		 Thread t=new Thread(d);
		 t.start();
	}
}
