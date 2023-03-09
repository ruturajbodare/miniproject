package Abstraction;
abstract class language
{
	//method of abstraction class
	public void show()
	{
		System.out.println("this is java language");
	}
}
public class demo extends language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//language a=new language();//we can't able to create instance of language because it is an abstraction
		//create the object of main class
        demo a=new demo();
        a.show();
	}

}
