package Example;

public class MethodReference {
	public static void saySomething()
	{
	System.out.println("hello,this is static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReference obj=new MethodReference();
		Sayable sayable = MethodReference::saySomething;
		sayable.say();
		

	}

}
