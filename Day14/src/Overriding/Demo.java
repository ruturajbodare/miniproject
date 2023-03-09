package Overriding;
class human 
{
	//overridden methods any method in the parent class that method is called overridden
	//overriding parent method is used in the child class called overriding
	public void walk()
	{
		System.out.println("human can talk");
	}
	
}
class girls extends human
{
	//overriding parent class
	public void walk()
	{
		System.out.println("girls can talk");
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        girls obj=new girls();
        obj.walk();
        human ob=new human();
        ob.walk();
        
	}

}
