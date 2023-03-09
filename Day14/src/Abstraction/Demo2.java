package Abstraction;
abstract class birds
{
  //Abstract method
	abstract void makesound();//having no body
	//normal method
    public void fly()
    {
    	System.out.println("i can fly");
    }
}
class parrot extends birds
{
	public void makesound()
	{
		System.out.println("parrot sound...");
		
	}
}
class pigion extends birds
{
	public void makesound()
	{
		System.out.println("pigion sound...");
		
	}
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		birds b=new parrot();
		parrot p=new parrot();
		p.makesound();
		p.fly();
		pigion pg=new pigion();
		pg.makesound();
		
		pg.fly();
		

	}

}
