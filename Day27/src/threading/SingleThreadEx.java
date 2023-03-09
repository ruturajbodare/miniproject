package threading;

public class SingleThreadEx  extends Thread{
	public void run()
	{
		System.out.println("hii");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SingleThreadEx e=new  SingleThreadEx();
		 e.start();
	}

}
